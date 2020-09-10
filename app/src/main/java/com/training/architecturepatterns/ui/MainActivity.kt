package com.training.architecturepatterns.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.training.architecturepatterns.R
import com.training.architecturepatterns.models.MovieModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, MovieView {
    private lateinit var presenter: MoviePresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
        presenter = MoviePresenter(this)
    }

    override fun onClick(view: View?) {
        if (view == button) presenter.getMovieDetails()
    }

    override fun onGetMovie(movieModel: MovieModel) {
        textView.text = movieModel.toString()
    }
}
