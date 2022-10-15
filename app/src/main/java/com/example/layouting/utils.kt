package com.example.layouting

import android.util.Log

fun String.setDefaultEmpty(default: String): String {
    return this.ifEmpty {
        default
    }
}

const val SHARED_PREF_NAME = "pref_name"
const val SHARED_PREF_MAJOR = "pref_major"
const val SHARED_PREF_SEMESTER = "pref_semester"

