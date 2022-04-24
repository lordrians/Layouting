package com.example.layouting

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.layouting.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieData = intent.getParcelableExtra<Movie>("movie_data")

        movieData?.let { setupRvCast(it.casts) }
        fillingData(movieData)

    }

    private fun setupRvCast(movieCast: ArrayList<MovieCast>) {
        val adapter = CastAdapter(movieCast, applicationContext)
        binding.rvCast.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCast.adapter = adapter
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun fillingData(movieData: Movie?) {

        movieData?.let { movie ->
            with(binding){
                tvTitle.text = movie.title
                tvReleaseDate.text = movie.releaseDate
                tvDuration.text = movie.duration
                tvRate.text = movie.rate
                tvDirector.text = movie.director
                tvTitle.text = movie.title
                tvGenre.text = movie.genre
                tvOverview.text = movie.overview
                ivPoster.setImageDrawable(getDrawable(movie.poster))
            }
        }

    }
}