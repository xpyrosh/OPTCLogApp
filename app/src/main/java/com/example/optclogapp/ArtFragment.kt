package com.example.optclogapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.squareup.picasso.Picasso

class ArtFragment : DialogFragment() {

    lateinit var unit1: String
    lateinit var url1: String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.art_popup, container)
        val imgArt = rootView.findViewById<ImageView>(R.id.imgArt)
        val unitNumber = rootView.findViewById<TextView>(R.id.unitNumber)

        val size = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 400f, imgArt.resources.displayMetrics).toInt()

        Picasso.get()
            .load(url1)
            .resize(size, size)
            .centerInside()
            .into(imgArt)
        unitNumber.setText(unit1)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.window?.decorView?.background = null
    }

    fun modifyArt(unit: String, url: String){
        unit1 = unit
        url1 = url
    }
}