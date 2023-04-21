package com.example.news

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(val news: ArrayList<TheNews>, val context: Context): RecyclerView.Adapter<ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_news, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.avatar.setImageBitmap(news[position].photo_news)
        holder.name.text = news[position].title
        holder.profession.text = news[position].count_like
        holder.description.text = news[position].description
    }
    override fun getItemCount(): Int {
        return news.size
    }
}
class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val avatar = itemView.im
    val name = itemView.tvName
    val profession = itemView.tvSpeciallity
    val description = itemView.tvDescription
}
