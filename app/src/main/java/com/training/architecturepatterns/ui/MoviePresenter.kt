package com.training.architecturepatterns.ui

import com.training.architecturepatterns.models.MovieModel

class MoviePresenter(val view: MovieView) {

    private fun getMovieFromDataBase(): MovieModel =
        MovieModel("UnderWorld", "horror", "description here.....")

    fun getMovieDetails() {
        view.onGetMovie(getMovieFromDataBase())
    }


}