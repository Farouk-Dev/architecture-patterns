package com.training.architecturepatterns.ui

import com.training.architecturepatterns.models.MovieModel

interface MovieView {
    fun onGetMovie(movieModel: MovieModel)
}