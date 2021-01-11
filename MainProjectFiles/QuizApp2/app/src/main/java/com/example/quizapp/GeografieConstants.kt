package com.example.quizapp

object GeografieConstants{
    fun getQuestions(): ArrayList<vragenLayout>{
        val vragenlijst = ArrayList<vragenLayout>()

        val vraag1 = vragenLayout(
            1,
            "Welke van de volgende landen is in zuid-amerika?",
            "Lesotho",
            "Guyana",
            "Guadeloupe",
            3 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag1)

        val vraag2 = vragenLayout(
            2,
            "Wat is de hoofdstad van polen?",
            "Wenen",
            "Warschau",
            "Reykjavik",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag2)

        val vraag3 = vragenLayout(
            3,
            "Hoeveel landen zijn er in noord-amerika?",
            "2",
            "3",
            "4",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag3)

        val vraag4 = vragenLayout(
            4,
            "Welke van de volgende antwoorden is geen staat in Amerika?",
            "New York",
            "Wyoming",
            "Boston",
            3 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag4)

        val vraag5 = vragenLayout(
            5,
            "Wie is de huidige president van de VS?",
            "GIDI",
            "Joe Biden",
            "Donald Trump",
            3 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag5)

        val vraag6 = vragenLayout(
            6,
            "Welke van de volgende landen hebben de meeste inwoners?",
            "Frankrijk",
            "Verenigdkoninkrijk",
            "Italië",
            1 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag6)

        val vraag7 = vragenLayout(
            7,
            "Welke van de volgende steden is in Frankrijk?",
            "Lyon",
            "Cayenne",
            "Quebec",
            1 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag7)

        val vraag8 = vragenLayout(
            8,
            "Welke stad is de stad van de liefde?",
            "Parijs",
            "Venetië",
            "Rome",
            1 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag8)

        val vraag9 = vragenLayout(
            9,
            "Welke van de volgende hoofdsteden bestaat het langste?",
            "Athene",
            "Damascus",
            "De Bijlmer",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag9)

        val vraag10 = vragenLayout(
            10,
            "Welke van de volgende hoofdsteden bestaat het kortste?",
            "Londen",
            "Praag",
            "Rabat",
            2 //Correcte antwoord(1 = optieÉén, 2 = optieTwee, 3 = optieDrie )
        )
        vragenlijst.add(vraag10)

        return vragenlijst


    }
}