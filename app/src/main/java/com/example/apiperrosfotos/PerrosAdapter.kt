package com.example.apiperrosfotos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PerrosAdapter(private val imagenes:List<String>) : RecyclerView.Adapter<PerrosView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerrosView {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PerrosView(layoutInflater.inflate(R.layout.item_perro, parent, false))
    }

    override fun getItemCount(): Int = imagenes.size

    override fun onBindViewHolder(holder: PerrosView, position: Int) {
        val item: String = imagenes[position]
        holder.bind(item)
    }
}
