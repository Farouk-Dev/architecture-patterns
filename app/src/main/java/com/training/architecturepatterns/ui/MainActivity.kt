package com.training.architecturepatterns.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.training.architecturepatterns.R
import com.training.architecturepatterns.models.MovieModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var viewModel: MovieViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        viewModel.movieMutableLiveData.observe(this, Observer { textView.text = it.toString() })
    }

    override fun onClick(view: View?) {
        if (view == button) viewModel.getMovieDetails()
    }

}
