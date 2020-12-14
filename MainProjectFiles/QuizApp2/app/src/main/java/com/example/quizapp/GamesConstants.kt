package com.example.quizapp

object GamesConstants{
    fun getQuestions(): ArrayList<vragenLayout>{
        val vragenlijst = ArrayList<vragenLayout>()

        val vraag1 = vragenLayout(
                1,
                "Welke game was game of the year in 2019 ?",
                "Sekiro : Shadows Die Twice",
                "Super Smash Bros Ultimate",
                "Death Stranding",
                1 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag1)

        val vraag2 = vragenLayout(
            2,
            "Welke game is een adventure game uit deze 3?",
            "XCOM 2",
            "God Of War",
            "FIFA 21",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag2)

        val vraag3 = vragenLayout(
            3,
            "De eerste game die er is gemaakt?",
            "Cathode Ray Tube",
            "Tennis For Two",
            "Galaxy Game",
            1 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag3)

        val vraag4 = vragenLayout(
            4,
            "Wie is de oprichter van PlayStation?",
            "Shigeru Miyamoto",
            "Kazama Kiryu",
            "Ken Kutagari",
            3 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag4)

        val vraag5 = vragenLayout(
            5,
            "Meest verkochte spel ter wereld?",
            "Grand Theft Auto 5",
            "Minecraft",
            "Tetris",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag5)

        val vraag6 = vragenLayout(
            6,
            "Hoeveel Zelda games zijn er?",
            "14",
            "22",
            "19",
            3 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag6)

        val vraag7 = vragenLayout(
            7,
            "Meest gekochte gaming systeem?",
            "PlayStation 2",
            "Xbox 360",
            "Game Boy",
            1 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag7)

        val vraag8 = vragenLayout(
            8,
            "Wie is de broer van Mario?",
            "Luigi",
            "Bowser",
            "Walid AKA Waluigi",
            1 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag8)

        val vraag9 = vragenLayout(
            9,
            "Wie is de meest populaire game karakter?",
            "Master Chief",
            "Mario",
            "Sonic The Hedgehog",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag9)

        val vraag10 = vragenLayout(
            10,
            "Welke game heeft Rockstar niet gemaakt?",
            "Red Dead Redemption ",
            "Midnight Club : LA",
            "Saints Row",
            3 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag10)

        return vragenlijst
    }
}