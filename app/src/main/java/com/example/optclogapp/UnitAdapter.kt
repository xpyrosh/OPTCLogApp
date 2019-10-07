package com.example.optclogapp

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.*
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


class UnitAdapter(var legends: List<Units>) : RecyclerView.Adapter<UnitAdapter.UnitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.units, parent, false)
        return UnitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return legends.size
    }

    override fun onBindViewHolder(unitHolder: UnitViewHolder, position: Int) {

        val artFrag = ArtFragment()

        //the text for the unit number
        unitHolder.txtName.text = legends[position].unitId
        val digit = unitHolder.txtName.text

        //Load the art from the web via Picasso
        Picasso.get().load(legends[position].thumbnailIcon).into(unitHolder.imgThumbnail)

        // Check if the user owns a legend before setting gray or not
        if (!UserRepo.loggedInUser?.legendsOwned?.contains(legends[position].unitId)!!){
            //Turn the art gray by default
            unitHolder.imgThumbnail.setColorFilter(ColorMatrixColorFilter(ColorMatrix().also { it.setSaturation(0f) }))
        }
        else{
            //If the user already owns the legend remove gray
            unitHolder.imgThumbnail.clearColorFilter()
        }

        // Click listener for each individual grid item
        unitHolder.imgThumbnail.setOnClickListener{ v ->

            //Variable for View Context so I don't have to keep re-writing
            var unitRec = (v.context as UnitRecycler)

            //Value to determine if the UpdateNakama switch was checked
            val checking = unitRec.findViewById<Switch>(R.id.switch1).isChecked

            if (checking){
                // If the user already owns clicked unit, remove it else add it
                if (UserRepo.loggedInUser?.legendsOwned?.contains(legends[position].unitId)!!){
                    //removing the legend from the users owned legends
                    UserRepo.loggedInUser?.removeNakama(legends[position].unitId)

                    // Applying gray scale
                    unitHolder.imgThumbnail.setColorFilter(ColorMatrixColorFilter(ColorMatrix().also { it.setSaturation(0f) }))
                }
                else {
                    //Appending legend units to the specific users list of owned legends
                    UserRepo.loggedInUser?.updateNakama(legends[position].unitId)

                    //Since the unit is owned, remove the gray scale
                    unitHolder.imgThumbnail.clearColorFilter()
                }
            }
            else{
                //Showing the art only if the update switch is off
                artFrag.modifyArt(legends[position].unitId, legends[position].artWork)
                artFrag.show((v.context as UnitRecycler).supportFragmentManager, "art")
            }

            Log.d("OPTC Log", "Testing toggle status : $checking")

            //Setting the owned legend count
            unitRec.findViewById<TextView>(R.id.txtLegs).text = UserRepo.loggedInUser?.legendsOwned?.size.toString()

        }
    }

    inner class UnitViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtName = view.findViewById<TextView>(R.id.textName)
        val imgThumbnail = view.findViewById<ImageView>(R.id.imgThumbnail)
    }

}