package com.example.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsList = listOf(
            TheNews(
                R.drawable.bmw,
                getString(R.string.BMWNewsTitle),
                getString(R.string.BMWNewsDescription),
            0),
            TheNews(
                R.drawable.emot3,
                getString(R.string.EmotionsTitle),
                getString(R.string.EmotionsDescription),
            0),
            TheNews(
                R.drawable.topfilms,
                getString(R.string.TopFilmsTitle),
                getString(R.string.TopFilmsDescription),
            0),
            TheNews(
                R.drawable.panda,
                getString(R.string.PandaTitle),
                getString(R.string.PandaDescription),
            0),
            TheNews(
                R.drawable.riot,
                getString(R.string.RiotTitle),
                getString(R.string.RiotDescription),
            0),
            TheNews(
                R.drawable.teslacar,
                getString(R.string.TeslaTitle),
                getString(R.string.TeslaDescription),
            0),
            TheNews(
                R.drawable.redplanet,
                getString(R.string.TeslaTitle),
                 getString(R.string.TeslaDescription),
            0),TheNews(
                R.drawable.bmw,
                getString(R.string.BMWNewsTitle),
                getString(R.string.BMWNewsDescription),
                0),
            TheNews(
                R.drawable.emot3,
                getString(R.string.EmotionsTitle),
                getString(R.string.EmotionsDescription),
                0),
            TheNews(
                R.drawable.topfilms,
                getString(R.string.TopFilmsTitle),
                getString(R.string.TopFilmsDescription),
                0),
            TheNews(
                R.drawable.panda,
                getString(R.string.PandaTitle),
                getString(R.string.PandaDescription),
                0),
            TheNews(
                R.drawable.riot,
                getString(R.string.RiotTitle),
                getString(R.string.RiotDescription),
                0),
            TheNews(
                R.drawable.teslacar,
                getString(R.string.TeslaTitle),
                getString(R.string.TeslaDescription),
                0),
            TheNews(
                R.drawable.redplanet,
                getString(R.string.TeslaTitle),
                getString(R.string.TeslaDescription),
                0)

        )
        val newsRecyclerView: RecyclerView = findViewById(R.id.recyclerView)
        newsRecyclerView.adapter = NewsAdapter(newsList)
        newsRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    }
