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
                "После долгого ожидания, финальная часть эпической саги о Мстителях наконец-то выходит на экраны кинотеатров. Фильм обещает быть одним из самых зрелищных и захватывающих фильмов года.",
            0),
            TheNews(
                R.drawable.emot3,
                "Fun prolongs life. Proven by scientists",
                "После долгого ожидания, финальная часть эпической саги о Мстителях наконец-то выходит на экраны кинотеатров. Фильм обещает быть одним из самых зрелищных и захватывающих фильмов года.",
            0),
            TheNews(
                R.drawable.topfilms,
                "Новый фильм Мстители: Финал",
                "После долгого ожидания, финальная часть эпической саги о Мстителях наконец-то выходит на экраны кинотеатров. Фильм обещает быть одним из самых зрелищных и захватывающих фильмов года.",
            0),
            TheNews(
                R.drawable.bmw,
                "Новый фильм Мстители: Финал",
                "После долгого ожидания, финальная часть эпической саги о Мстителях наконец-то выходит на экраны кинотеатров. Фильм обещает быть одним из самых зрелищных и захватывающих фильмов года.",
            0),
            TheNews(
                R.drawable.bmw,
                "Новый фильм Мстители: Финал",
                "После долгого ожидания, финальная часть эпической саги о Мстителях наконец-то выходит на экраны кинотеатров. Фильм обещает быть одним из самых зрелищных и захватывающих фильмов года.",
            0),
            TheNews(
                R.drawable.bmw,
                "Новый фильм Мстители: Финал",
                "После долгого ожидания, финальная часть эпической саги о Мстителях наконец-то выходит на экраны кинотеатров. Фильм обещает быть одним из самых зрелищных и захватывающих фильмов года.",
            0),
            TheNews(
                R.drawable.bmw,
                "Новый фильм Мстители: Финал",
                "После долгого ожидания, финальная часть эпической саги о Мстителях наконец-то выходит на экраны кинотеатров. Фильм обещает быть одним из самых зрелищных и захватывающих фильмов года.",
            0),
            TheNews(
                R.drawable.bmw,
                "Новый фильм Мстители: Финал",
                "После долгого ожидания, финальная часть эпической саги о Мстителях наконец-то выходит на экраны кинотеатров. Фильм обещает быть одним из самых зрелищных и захватывающих фильмов года.",
            0)
        )
        val newsRecyclerView: RecyclerView = findViewById(R.id.recyclerView)
        newsRecyclerView.adapter = NewsAdapter(newsList)
        newsRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    }
