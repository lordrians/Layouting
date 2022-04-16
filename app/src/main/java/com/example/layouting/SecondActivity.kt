package com.example.layouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("qwer", "onCreate: Second Activity ")
    }

    override fun onStart() {
        super.onStart()
        Log.d("qwer", "onStart: Second Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("qwer", "onResume: Second Activity ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("qwer", "onPause: Second Activity ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("qwer", "onStop: Second Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("qwer", "onDestroy: Second Activity ")
    }

}