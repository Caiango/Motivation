package com.example.motivation.util

// classe que vou chamar para salvar os nomes, construtor privado pq eu não quero parametros aqui, eles serão passados em outro lugar

class Motivation_Constants private constructor(){

    object KEY{
        val PERSON_NAME = "personName"
    }

//        vou usar para chamar o tipo de frase, ela é igual a um numero pq o tipo eh categoria como Int
    object Frase{
        val all = 1
        val sun = 2
        val happy = 3
    }

}