package com.example.layouting

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.layouting.databinding.ItemMovieBinding

class MovieAdapter (val listMovie: ArrayList<Movie>, val mContext: Context): RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    private lateinit var onClickItemCallback: OnClickItemCallback

    fun setOnItemClickCallback(onClickItemCallback: OnClickItemCallback){
        this.onClickItemCallback = onClickItemCallback
    }

    inner class ViewHolder(private val binding: ItemMovieBinding)
        : RecyclerView.ViewHolder(binding.root){
            @SuppressLint("UseCompatLoadingForDrawables")
            fun bind(movie: Movie){
                with(binding){
                    tvTitle.text = movie.title
                    tvReleaseDate.text = movie.releaseDate
                    tvDuration.text = movie.duration
                    tvRate.text = movie.rate
                    tvDirector.text = movie.director
                    tvGenre.text = movie.genres
                    ivPoster.setImageDrawable(mContext.getDrawable(movie.poster))

                    root.setOnClickListener {
                        onClickItemCallback.onItemClicked(movie)
                    }
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("qwer", "onBindViewHolder: ${listMovie[position]} ")
        return holder.bind(listMovie[position])
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

    interface OnClickItemCallback {
        fun onItemClicked(movie: Movie)
    }
}