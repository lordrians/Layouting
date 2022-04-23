package com.example.layouting

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.layouting.databinding.ItemMovieBinding

class MovieAdapter(
    val listMovie: ArrayList<Movie>,
    val context: Context
) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    private lateinit var binding: ItemMovieBinding

    private lateinit var clickUseCase: OnClickItemCallback

    fun setClickItemCallback(onClickItemCallback: OnClickItemCallback){
        this.clickUseCase = onClickItemCallback
    }

    inner class MyViewHolder (private val bindingItem: ItemMovieBinding)
        : RecyclerView.ViewHolder(bindingItem.root){

            @SuppressLint("UseCompatLoadingForDrawables")
            fun bindData(movie: Movie){
                with(bindingItem){
                    tvTitle.text = movie.title
                    tvReleaseDate.text = movie.releaseDate
                    tvDuration.text = movie.duration
                    tvRate.text = movie.rate
                    tvDirector.text = movie.director
                    tvGenre.text = movie.genre
                    ivPoster.setImageDrawable(context.getDrawable(movie.poster))

//                    ivPoster.setOnClickListener {
//                        Toast.makeText(context, "Judul = ${movie.title}", Toast.LENGTH_LONG).show()
//                    }

                    root.setOnClickListener {
                        clickUseCase.onClickItemCallback(movie)
                    }

//                    tvTitle.setOnClickListener {
//                        Toast.makeText(context, "Genre = ${movie.genre}", Toast.LENGTH_LONG).show()
//                    }

                }
            }

    }

    //Create item view buat holder per item nya masing"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MyViewHolder {
        binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    //Menggabungkan data yg diterima,
    //yg nantinya di implement ke view holder
    override fun onBindViewHolder(holder: MovieAdapter.MyViewHolder, position: Int) {
        holder.bindData(listMovie[position])
    }

    //Memberi tau jumlah datanya
    override fun getItemCount() = listMovie.size

    interface OnClickItemCallback {
        fun onClickItemCallback(movie: Movie)
    }

}