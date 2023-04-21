package com.example.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(private val newsList: List<TheNews>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imNews)
        private val titleTextView: TextView = itemView.findViewById(R.id.textTitle)
        //private val textTextView: TextView = itemView.findViewById(R.id.textTextView)
        val newsLikes: TextView = itemView.findViewById(R.id.textLikes)
        val likeButton: ImageButton = itemView.findViewById(R.id.imLikes)

        fun bind(news: TheNews) {
            imageView.setImageResource(news.imageRes)
            titleTextView.text = news.title
            //textTextView.text = news.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(newsList[position])
    }

    override fun getItemCount() = newsList.size
}