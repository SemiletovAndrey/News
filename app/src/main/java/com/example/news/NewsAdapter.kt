package com.example.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(private val newsList: List<TheNews>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imNews)
        val titleTextView: TextView = itemView.findViewById(R.id.textTitle)
        val likeButton: ImageView = itemView.findViewById(R.id.likeButton)
        //private val textTextView: TextView = itemView.findViewById(R.id.textTextView)
        val count_like: TextView = itemView.findViewById(R.id.textLikes)
        var isLiked: Boolean = false

        fun bind(news: TheNews) {
            imageView.setImageResource(news.imageRes)
            titleTextView.text = news.title
            count_like.text = news.count_like.toString()
            updateLikeButton()
            likeButton.setOnClickListener {
                isLiked = !isLiked // Toggle the like state
                updateLikeButton() // Update the like button to reflect the new state
                updateLikeCount()
            }
        }
        private fun updateLikeButton() {
            if (isLiked) {
                likeButton.setImageResource(R.drawable.likes) // Change to liked icon
            } else {
                likeButton.setImageResource(R.drawable.like) // Change to unliked icon
            }
        }

        private fun updateLikeCount() {
            val currentLikes = count_like.text.toString().toInt()
            val newLikes = if (isLiked) currentLikes + 1 else currentLikes - 1 // Add or remove a like based on the current state
            count_like.text = newLikes.toString()
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(newsList[position])
    }

    override fun getItemCount() = newsList.size
}