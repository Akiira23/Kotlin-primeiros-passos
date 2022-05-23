package br.com.alura.bytebank.arrays

fun testaArraySalarios() {
    val salarios: DoubleArray = doubleArrayOf(1500.0, 2350.2, 5000.0, 8245.5, 10000.0)
    val aumento = 1.1

    for (indice in salarios.indices) {
        salarios[indice] *= aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { index, salario ->
        salarios[index] *= aumento
    }
    println(salarios.contentToString())
}