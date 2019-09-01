package com.example.optclogapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

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
    }

    inner class UnitViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtName = view.findViewById<TextView>(R.id.textName)
        val imgThumbnail = view.findViewById<ImageView>(R.id.imgThumbnail)
    }

}