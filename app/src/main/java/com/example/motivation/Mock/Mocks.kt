package com.example.motivation.Mock

import com.example.motivation.util.Motivation_Constants

//pacote onde terão as frases

// As frases vão em String e vou chcamar o tipodela pela categoria (all, sol, feliz)
class Frase (description: String, category: Int)

class Mocks {
//    criei essas variaveis pra ficar mais fácil de escrever
    private val ALL = Motivation_Constants.Frase.all
    private val SUN = Motivation_Constants.Frase.sun
    private val HAPPY = Motivation_Constants.Frase.happy

    val mListFrases: List<Frase> = listOf(
        Frase("Sua luta não termina quando sentir cansaço, mas sim quando atingir o sucesso tão merecido.", SUN),
        Frase("Não perca a motivação só porque as coisas não estão correndo como o previsto. Adversidade gera sabedoria e é isso que levará você ao sucesso.", SUN),
        Frase("As pessoas dizem frequentemente que a motivação não dura. Bem, nem o banho - e é por isso que ele é recomendado diariamente.", HAPPY),
        Frase("Às vezes um pouco de motivação ajuda a superar os maiores desafios.", HAPPY),
        Frase("Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.", SUN),
        Frase("Arrisque, vá em frente e sem medo! Não há motivação maior do que descobrir quão corajosos conseguimos ser.", SUN),
        Frase("Assim como os pássaros, precisamos aprender a superar os desafios que nos são apresentados, para alçarmos voos mais altos.", HAPPY),
        Frase("Sonhos existem para serem realizados, por isso não olhe para trás nem escute palavras de desânimo!", SUN),
        Frase("O poder está dentro de você, na sua mente, pois se acreditar que consegue não haverá obstáculo capaz de impedir o seu sucesso.", SUN),
        Frase("Não importa se seu sonho vai se realizar hoje ou amanhã, mas sim que você trabalhe para o alcançar todos os dias", HAPPY),
        Frase("Trabalhe por uma causa, e não por aplausos. Trabalhe para expressar o melhor de você, e não para impressionar.", HAPPY),
        Frase("Sempre que a meta parecer longe, lembre-se que a distância é relativa e uma questão de perspectiva!", HAPPY)
    )
}