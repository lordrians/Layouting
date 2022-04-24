package com.example.layouting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ScrollView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.layouting.databinding.ActivityListMovieBinding

class ListMovieActivity : AppCompatActivity() {

    lateinit var binding: ActivityListMovieBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dtMovie = dtMovie()
        val listMovie = dtMovie.getMovie()

        val movieAdapter = MovieAdapter(listMovie, applicationContext)

        with(binding){
            rvMovie.layoutManager = LinearLayoutManager(applicationContext)
            rvMovie.adapter = movieAdapter
        }

        movieAdapter.setClickItemCallback(object : MovieAdapter.OnClickItemCallback{
            override fun onClickItemCallback(movie: Movie) {
                val intent = Intent(this@ListMovieActivity, DetailActivity::class.java)
                intent.putExtra("movie_data", movie)
                startActivity(intent)
            }
        })


    }

}