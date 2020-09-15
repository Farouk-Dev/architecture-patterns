package com.training.architecturepatterns.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.training.architecturepatterns.models.MovieModel

class MovieViewModel :ViewModel(){
    var movieMutableLiveData: MutableLiveData<MovieModel> = MutableLiveData()

    private fun getMovieFromDataBase(): MovieModel =
        MovieModel("UnderWorld", "horror", "description here.....")

    fun getMovieDetails() {
        var movieDetails = getMovieFromDataBase()
        movieMutableLiveData.value = movieDetails
    }
}