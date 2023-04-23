package com.example.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView

class NewsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)

        val news = intent.getSerializableExtra("news") as TheNews

        val imageRes = intent.getIntExtra("imageRes", 0)
        val imageView: ImageView = findViewById(R.id.imNewsDetail)
        val titleTextView: TextView = findViewById(R.id.textTitleDetail)
        val descriptionTextView: TextView = findViewById(R.id.txNewsDescriptionDetail)
        val likeButton= findViewById<ImageView>(R.id.imLikeDescription)
        //val count_like = intent.getIntExtra("count_like",0)



        imageView.setImageResource(imageRes)

        titleTextView.text = intent.getStringExtra("title")
        descriptionTextView.text = intent.getStringExtra("description")
        //count_like.text = intent.getIntExtra("count_like",0).toString()
        likeButton.setImageResource(if (news.isLiked) R.drawable.likes else R.drawable.like)


       likeButton.setOnClickListener {
            news.isLiked = !news.isLiked
            if (news.isLiked) {
                likeButton.setImageResource(R.drawable.likes)
                news.count_like++
            } else {
                likeButton.setImageResource(R.drawable.like)
                news.count_like--
            }
        }
    }


}