package com.example.layouting

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class Movie(
    val title: String,
    val releaseDate: String,
    val duration: String,
    val rate: String,
    val director: String,
    val genre: String,
    val poster: Int,
    val overview: String,
): Parcelable


