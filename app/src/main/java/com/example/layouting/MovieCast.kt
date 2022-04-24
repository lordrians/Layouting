package com.example.layouting

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieCast(
    val poster: Int,
    val actorName: String,
    val charName: String
): Parcelable
