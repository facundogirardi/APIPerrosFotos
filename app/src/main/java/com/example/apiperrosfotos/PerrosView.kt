package com.example.apiperrosfotos

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.apiperrosfotos.databinding.ItemPerroBinding
import com.squareup.picasso.Picasso

class PerrosView(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemPerroBinding.bind(view)

    fun bind(image: String) {
        Picasso.get().load(image).into(binding.ivDog)
    }
}

