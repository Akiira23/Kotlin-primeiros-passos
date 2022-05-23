package br.com.alura.bytebank.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun testaArrayObjetos() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.45", "3500.75", "8400.75", "10250.75")

    println(salarios.contentToString())
    val aumento = "1.1".toBigDecimal()

    val salarioComAumento: Array<BigDecimal> = salarios.map { salario ->
        if (salario < "5000".toBigDecimal()) {
            salario + "500".toBigDecimal()
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()
    println(salarioComAumento.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}