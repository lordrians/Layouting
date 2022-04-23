package com.example.layouting

class dtMovie {
    val title = listOf(
        "The Batman",
        "Spider-Man: No Way Home",
        "Turning Red",
        "Sonic the Hedgehog 2",
        "Yaksha: Ruthless Operations",
        "All the Old Knives",
        "Moonfall",
        "The Outfit",
        "War of the Worlds: Annihilation",
        "Encanto"
    )

    val releaseDate = listOf(
        "11/24/2021",
        "11/24/2021",
        "11/24/2021",
        "11/24/2021",
        "11/24/2021",
        "11/24/2021",
        "11/24/2021",
        "11/24/2021",
        "11/24/2021",
        "11/24/2021"
    )

    val duration = listOf(
        "1h 42m",
        "1h 42m",
        "1h 42m",
        "1h 42m",
        "1h 42m",
        "1h 42m",
        "1h 42m",
        "1h 42m",
        "1h 42m",
        "1h 42m"
    )

    val rate = listOf(
        "7.7",
        "7.7",
        "7.7",
        "7.7",
        "7.7",
        "7.7",
        "7.7",
        "7.7",
        "7.7",
        "7.7"
    )

    val director = listOf(
        "Byron Howard",
        "Byron Howard",
        "Byron Howard",
        "Byron Howard",
        "Byron Howard",
        "Byron Howard",
        "Byron Howard",
        "Byron Howard",
        "Byron Howard",
        "Byron Howard"
    )

    val genres = listOf(
        "Animation, Comedy, Family, Fantasy",
        "Animation, Comedy, Family, Fantasy",
        "Animation, Comedy, Family, Fantasy",
        "Animation, Comedy, Family, Fantasy",
        "Animation, Comedy, Family, Fantasy",
        "Animation, Comedy, Family, Fantasy",
        "Animation, Comedy, Family, Fantasy",
        "Animation, Comedy, Family, Fantasy",
        "Animation, Comedy, Family, Fantasy",
        "Animation, Comedy, Family, Fantasy"
    )

    val poster = listOf(
        R.drawable.poster,
        R.drawable.poster,
        R.drawable.poster,
        R.drawable.poster,
        R.drawable.poster,
        R.drawable.poster,
        R.drawable.poster,
        R.drawable.poster,
        R.drawable.poster,
        R.drawable.poster
    )

    fun getMovieData(): ArrayList<Movie> {
        val listMovie = ArrayList<Movie>()
        for (position in 0..9){
            val movie = Movie(
                title = title[position],
                releaseDate = releaseDate[position],
                duration = duration[position],
                rate = rate[position],
                director = director[position],
                genres = genres[position],
                poster = poster[position],
                summary = null
            )
            listMovie.add(movie)
        }
        return listMovie
    }
}