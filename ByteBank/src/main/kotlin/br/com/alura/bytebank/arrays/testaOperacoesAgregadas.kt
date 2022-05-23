package br.com.alura.bytebank.arrays

fun testaOperacoesAgregadas() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    val max = idades.maxOrNull()
    println("Maior idade: $max")

    val min = idades.minOrNull()
    println("Menor idade: $min")

    val media: Double = idades.average()
    println("Media das idades: $media")

    val todosMaiores = idades.all { it >= 18 }         //todos os valores satisfazem a condicao
    println("Todos maiores de idade: $todosMaiores")

    val existeMaior = idades.any { it >= 18 }        //pelo menos um dos valores satisfazer a condicao
    println("Existe pelo menos um maior de idade: $existeMaior")

    val maioreDeIdade = idades.filter { it >= 18 }     //busca todos os valores que satisfazem a condicao
    println("Maiores de idade: $maioreDeIdade")

    val buscaMaiorDeIdade = idades.find { it >= 18 }    //busca o primeiro valor que satisfaz a condicao
    println("busca de maior de idade: $buscaMaiorDeIdade")
}
