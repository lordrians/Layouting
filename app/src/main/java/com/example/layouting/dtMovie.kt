package com.example.layouting

class dtMovie {

    val listTitle = listOf(
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

    val listPoster = listOf(
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

    val listReleaseDate = listOf(
        "03/02/2022",
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

    val listDuration = listOf(
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

    val listRate = listOf(
        "7,7",
        "7,7",
        "7,7",
        "7,7",
        "7,7",
        "7,7",
        "7,7",
        "7,7",
        "7,7",
        "7,7",
    )

    val listDirector = listOf(
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

    val listGenre = listOf(
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

    fun getMovie(): ArrayList<Movie>{
        val listMovie = ArrayList<Movie>()

        for (position in listTitle.indices){
            val movie = Movie(
                title = listTitle[position],
                releaseDate = listReleaseDate[position],
                duration = listDuration[position],
                rate = listRate[position],
                director = listDirector[position],
                genre = listGenre[position],
                poster = listPoster[position]
            )

            listMovie.add(movie)
        }

        return listMovie
    }

}