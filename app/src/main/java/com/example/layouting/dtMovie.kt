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
        R.drawable.poster_batman_1,
        R.drawable.poster_nwh_2,
        R.drawable.poster_turningred_3,
        R.drawable.poster_sonic2_4,
        R.drawable.poster_yaksha_5,
        R.drawable.poster_alloldknives_6,
        R.drawable.poster_moonfall_7,
        R.drawable.poster_theoutfit_8,
        R.drawable.poster_war_world_9,
        R.drawable.poster_encanto_10
    )

    val listReleaseDate = listOf(
        "03/02/2022 (ID)",
        "12/17/2021 (US)",
        "03/10/2022 (CZ)",
        "04/08/2022 (US)",
        "04/08/2022 (KR)",
        "04/08/2022 (GB)",
        "02/04/2022 (US)",
        "03/18/2022 (US)",
        "12/22/2021 (US)",
        "11/24/2021 (US)"
    )

    val listDuration = listOf(
        "2h 56m",
        "2h 28m",
        "1h 40m",
        "2h 2m",
        "2h 5m",
        "1h 42m",
        "2h 10m",
        "1h 45m",
        "1h 53m",
        "1h 42m"
    )

    val listRate = listOf(
        "7,9",
        "8,1",
        "7,5",
        "7,7",
        "6,2",
        "6,1",
        "6,5",
        "7,2",
        "6.0",
        "7,7",
    )

    val listDirector = listOf(
        "Matt Reeves",
        "Jon Watts",
        "Domee Shi",
        "Jeff Fowler",
        "Ahn Sang-hoon",
        "Janus Metz Pedersen",
        "Harald Kloser",
        "Johnathan McClain",
        "Conor Dowling",
        "Byron Howard"
    )

    val listGenre = listOf(
        "Crime, Mystery, Thriller",
        "Action, Adventure, Science Fiction",
        "Animation, Family, Comedy, Fantasy",
        "Action, Science Fiction, Comedy, Family",
        "Action",
        "Thriller, Action",
        "Action, Adventure, Science Fiction",
        "Drama, Thriller, Crime",
        "Science Fiction, Action",
        "Animation, Comedy, Family, Fantasy"
    )

    val listOverview = listOf(
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
    )

    val listActorName = listOf(
        "Tobey Maguire",
        "ABSD",
        "QEWER",
        "Tobey Maguire",
        "Tobey Maguire",
        "Tobey Maguire",
        "Tobey Maguire",
        "Tobey Maguire",
        "Tobey Maguire",
        "Tobey Maguire",
        "Tobey Maguire",
        "Tobey Maguire",
        "Tobey Maguire",
        "Tobey Maguire",
        "Tobey Maguire"
    )

    val listCharName = listOf(
        "Spider-Man",
        "Spider-Man 1",
        "Spider-Man 2",
        "Spider-Man 3",
        "Spider-Man",
        "Spider-Man",
        "Spider-Man",
        "Spider-Man",
        "Spider-Man",
        "Spider-Man",
        "Spider-Man",
        "Spider-Man",
        "Spider-Man",
        "Spider-Man",
        "Spider-Man"
    )

    val listPosterCast = listOf(
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast,
        R.drawable.cast
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
                poster = listPoster[position],
                overview = listOverview[position]
            )



            listMovie.add(movie)
        }

        return listMovie
    }

    fun getCast(): ArrayList<MovieCast>{

        val listCast = ArrayList<MovieCast>()
        for (castPosition in 0..4){
            val cast = MovieCast(
                poster = listPosterCast[castPosition],
                actorName = listActorName[castPosition],
                charName = listCharName[castPosition]
            )
            listCast.add(cast)
        }
        return listCast
    }

}