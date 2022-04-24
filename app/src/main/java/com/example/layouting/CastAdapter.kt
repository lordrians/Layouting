package com.example.layouting

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.layouting.databinding.ItemCastBinding

class CastAdapter (
    val listCast: ArrayList<MovieCast>,
    val context: Context
) : RecyclerView.Adapter<CastAdapter.MyViewHolder>(){

    lateinit var binding: ItemCastBinding

    inner class MyViewHolder(
        private val itemBinding: ItemCastBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("UseCompatLoadingForDrawables")
        fun bindData(movieCast: MovieCast){
            with(itemBinding){
                ivPoster.setImageDrawable(context.getDrawable(movieCast.poster))
                tvActorName.text = movieCast.actorName
                tvCharName.text = movieCast.charName
            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CastAdapter.MyViewHolder {
        binding = ItemCastBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CastAdapter.MyViewHolder, position: Int) {
        holder.bindData(listCast[position])
    }

    override fun getItemCount(): Int = listCast.size
}