package com.example.news

import android.content.Intent
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
        //val textTextView: TextView = itemView.findViewById(R.id.textTextView)
        val count_like: TextView = itemView.findViewById(R.id.textLikes)

        fun bind(news: TheNews) {
            imageView.setImageResource(news.imageRes)
            titleTextView.text = news.title

            count_like.text = news.count_like.toString()
            updateLikeButton(news)
            likeButton.setOnClickListener {
                news.isLiked = !news.isLiked // Toggle the like state
                updateLikeButton(news) // Update the like button to reflect the new state
                updateLikeCount(news)
            }

            titleTextView.setOnClickListener {
                // Переход на новую страницу с подробной информацией о новости
                val intent = Intent(itemView.context, NewsDetailActivity::class.java)
                intent.putExtra("news", news)
                intent.putExtra("imageRes", news.imageRes)
                intent.putExtra("title", news.title)
                intent.putExtra("description", news.description)
                intent.putExtra("count_like", news.count_like)
                //intent.putExtra("isLikes", news.isLiked)
                itemView.context.startActivity(intent)

            }

        }
        private fun updateLikeButton(news: TheNews) {
            if (news.isLiked) {
                likeButton.setImageResource(R.drawable.likes) // Change to liked icon
            } else {
                likeButton.setImageResource(R.drawable.like) // Change to unliked icon
            }
        }

        private fun updateLikeCount(news: TheNews) {
            val currentLikes = count_like.text.toString().toInt()
            val newLikes = if (news.isLiked) currentLikes + 1 else currentLikes - 1 // Add or remove a like based on the current state
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