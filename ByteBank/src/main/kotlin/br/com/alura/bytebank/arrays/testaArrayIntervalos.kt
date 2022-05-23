package br.com.alura.bytebank.arrays

fun testaArrayIntervalos() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        println(s)
    }

    println()

    val numerosPares = 0..20 step 2
    for (n in numerosPares) {
        println(n)
    }

    println()

    val numerosParesReverso = 20 downTo 0 step 2
    numerosParesReverso.forEach { println(it) }

    println()

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Salario esta dentro do intervalo")
    } else {
        println("nao esta dentro do intervalo")
    }

    println()

    val alfabeto = 'a'..'z'
    val letra = 'K'
    println(letra in alfabeto)
}