package com.example.layouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.layouting.databinding.ActivityListMovieBinding

class ListMovieActivity : AppCompatActivity() {
    lateinit var binding: ActivityListMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listMovie = dtMovie().getMovieData()
        Log.d("qwer", "onCreate: $listMovie")

        val movieAdapter = MovieAdapter(listMovie,applicationContext)
        binding.rvMovie.layoutManager = LinearLayoutManager(this)
        binding.rvMovie.adapter = movieAdapter


        movieAdapter.setOnItemClickCallback(object: MovieAdapter.OnClickItemCallback{
            override fun onItemClicked(movie: Movie) {
                Log.d("qwer", "onItemClicked:${movie.title} ")
            }
        })

    }

}