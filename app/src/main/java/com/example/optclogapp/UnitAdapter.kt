package com.example.optclogapp

import android.app.AlertDialog
import android.app.Dialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class UnitAdapter(var legends: List<String>) : RecyclerView.Adapter<UnitAdapter.UnitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.units, parent, false)
        return UnitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return legends.size
    }

    override fun onBindViewHolder(unitHolder: UnitViewHolder, position: Int) {
        unitHolder.txtName.text = legends[position]
        val digit = unitHolder.txtName.text
        val url = "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/54/F2446.png/"

        unitHolder.imgThumbnail.setOnClickListener{ v ->

            val artFrag = ArtFragment()
            artFrag.modifyArt(legends[position])
            artFrag.show((v.context as UnitRecycler).supportFragmentManager, "art")
        }

        Picasso.get().load(url).into(unitHolder.imgThumbnail)
    }

    inner class UnitViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtName = view.findViewById<TextView>(R.id.textName)
        val imgThumbnail = view.findViewById<ImageView>(R.id.imgThumbnail)
    }

}