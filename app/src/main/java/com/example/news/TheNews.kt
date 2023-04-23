package com.example.news

import android.graphics.Bitmap
import java.io.Serializable

class TheNews(val imageRes: Int, val title: String, val description: String, var count_like:Int, var isLiked: Boolean = false) :
    Serializable
