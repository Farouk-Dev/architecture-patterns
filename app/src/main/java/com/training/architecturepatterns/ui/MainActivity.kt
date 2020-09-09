package com.training.architecturepatterns.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.training.architecturepatterns.R
import com.training.architecturepatterns.models.MovieModel
import kotlinx.android.synthetic.main.activity_main.*
/*Controller*/
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
    }

    private fun getMovie(): MovieModel = MovieModel("UnderWorld", "horror", "description here.....")
    private fun showMovie() {
        textView.text = getMovie().toString()
    }

    override fun onClick(view: View?) {
        if (view == button) showMovie()
    }
}
