package com.example.layouting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.layouting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListener()


        Log.d("qwer", "onStart: First Activity")
    }

    private fun setupListener() {
        with(binding){
            btnListMovie.setOnClickListener {
                val intent = Intent(this@MainActivity, ListMovieActivity::class.java)
                startActivity(intent)
            }

            btnDetailMovie.setOnClickListener {
                startActivity(Intent(this@MainActivity, DetailActivity::class.java))
            }

            btnSecondActivity.setOnClickListener {
                startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("qwer", "onStart: First Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("qwer", "onResume: First Activity ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("qwer", "onPause: First Activity ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("qwer", "onStop: First Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("qwer", "onDestroy: First Activity ")
    }

}