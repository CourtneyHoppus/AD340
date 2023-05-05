package com.example.myfirstapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(
    private val pinList: List<ListModel>
    ) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.activity_list_adapter, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listModel = pinList[position]
        holder.pinTitle.text = listModel.title
        holder.pinYear.text = listModel.year
    }

    override fun getItemCount(): Int {
        return pinList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val pinTitle: TextView = itemView.findViewById(R.id.pinTitle)
        val pinYear: TextView = itemView.findViewById(R.id.pinYear)
    }
}
