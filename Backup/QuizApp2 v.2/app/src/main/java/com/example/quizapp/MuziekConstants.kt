package com.example.quizapp

object MuziekConstants{
    fun getQuestions(): ArrayList<vragenLayout>{
        val vragenlijst = ArrayList<vragenLayout>()

        val vraag1 = vragenLayout(
            1,
            "Wat is de meest gestreamde lied op Spotify van 2020?",
            "WAP – (ft. Megan Thee Stallion), Cardi B",
            "Dior – Pop Smoke",
            "Dakiti – Bad Bunny, Jhay Cortez",
            3 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag1)

        val vraag2 = vragenLayout(
            2,
            "Wie heeft de Song van het Jaar 2020 gewonnen?",
            "The Weeknd",
            "Billie Eilish",
            "Future",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag2)

        val vraag3 = vragenLayout(
            3,
            "Hoe oud waren Amy Winehouse, Kurt Cobain en Jimi Hendrix toen hun overleden?",
            "35",
            "44",
            "27 ",
            3 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag3)

        val vraag4 = vragenLayout(
            4,
            "Wat was Freddie Mercury zijn echte naam?",
            "Farrokh Bulsara",
            "Bryan May",
            "Freddie King",
            1 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag4)

        val vraag5 = vragenLayout(
            5,
            "Welk land heeft het Eurovisie Songfestival het vaakst gewonnen?",
            "Ierland",
            "Engeland",
            "Denemarken",
            1 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag5)

        val vraag6 = vragenLayout(
            6,
            "Welke artiest heeft de meeste volgers op Twitter?",
            "Nicki Minaj",
            "Justin Bieber",
            "Snoop Dogg",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag6)

        val vraag7 = vragenLayout(
            7,
            "Het album 'DAMN.' uit 2017 is uitgebracht door welke artiest?",
            "Drake",
            "Kendrick Lamar",
            "Trippie Redd",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag7)

        val vraag8 = vragenLayout(
            8,
            "Wie van de groep Migos is getrouwd met Cardi B?",
            "Offset",
            "Takeoff",
            "Quavo",
            1 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag8)

        val vraag9 = vragenLayout(
            9,
            "Tupac had twee woorden groot op zijn buik getatoeëerd. Welke woorden waren dat?",
            "50 Gun",
            "Thug Life",
            "Trust Nobody",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag9)

        val vraag10 = vragenLayout(
            10,
            "Welk instrument speelde Lil Uzi Vert op de middelbare school?",
            "Gitaar",
            "Drums",
            "Trompet",
            3 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag10)

        return vragenlijst
    }
}