package com.example.optclogapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import com.squareup.picasso.Picasso

class ArtFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.art_popup, container)
        val imgArt = rootView.findViewById<ImageView>(R.id.imgArt)
        rootView
        Picasso.get().load("https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/6e/C2446.png/").into(imgArt)

        return rootView
    }
}