package com.example.optclogapp

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.LightingColorFilter
import android.graphics.PorterDuff
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class UnitAdapter(var legends: List<Units>, var user: Users) : RecyclerView.Adapter<UnitAdapter.UnitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.units, parent, false)
        return UnitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return legends.size
    }

    override fun onBindViewHolder(unitHolder: UnitViewHolder, position: Int) {

        val artFrag = ArtFragment()

        unitHolder.txtName.text = legends[position].unitId
        val digit = unitHolder.txtName.text
        //val url = "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/54/F2446.png/"
        Picasso.get().load(legends[position].thumbnailIcon).into(unitHolder.imgThumbnail)

        unitHolder.imgThumbnail.setOnClickListener{ v ->

            var unitRec = (v.context as UnitRecycler)
            val checking = unitRec.findViewById<Switch>(R.id.switch1).isChecked
            if (checking){
                user.updateNakama()
                unitHolder.imgThumbnail.setColorFilter(LightingColorFilter(0,255))
            }
            else{
                unitHolder.imgThumbnail.clearColorFilter()
            }

            Log.d("OPTC Log", "Testing toggle status : $checking")
            //unitRec.findViewById<TextView>(R.id.txtPID).text = user.pID
            //unitRec.findViewById<TextView>(R.id.txtPLVL).text = user.pLVL
            unitRec.findViewById<TextView>(R.id.txtLegs).text = user.legendsOwned.toString()

            artFrag.modifyArt(legends[position].unitId, legends[position].artWork)
            artFrag.show((v.context as UnitRecycler).supportFragmentManager, "art")
        }
    }

    inner class UnitViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtName = view.findViewById<TextView>(R.id.textName)
        val imgThumbnail = view.findViewById<ImageView>(R.id.imgThumbnail)
    }

}