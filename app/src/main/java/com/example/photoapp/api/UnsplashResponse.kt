package com.example.photoapp.api

import com.example.photoapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)