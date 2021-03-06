package com.hoppus.ad340

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(
    private val movieList: List<MovieViewModel>,
    val clickListener: (Int) -> Unit
) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.movie_card_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movieViewModel = movieList[position]
        holder.movieTitleView.text = movieViewModel.title
        holder.movieYearView.text = movieViewModel.year
        holder.itemView.setOnClickListener { clickListener(position) }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val movieTitleView: TextView = itemView.findViewById(R.id.movieTitleView)
        val movieYearView: TextView = itemView.findViewById(R.id.movieYearView)
    }

}