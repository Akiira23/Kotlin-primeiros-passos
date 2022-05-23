package br.com.alura.bytebank.arrays

import java.math.BigDecimal
import java.math.RoundingMode


fun testaArrayObjetos() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.45", "3500.75", "8400.75", "10250.75")

    println(salarios.contentToString())
    val aumento = "1.1".toBigDecimal()
    val meses = 6.toBigDecimal()

    val salarioComAumento: Array<BigDecimal> = salarios.map { salario ->
        calculaAumentoRelativo(salario, aumento)
    }.toTypedArray()
    println(salarioComAumento.contentToString())

    val totalSalario = salarioComAumento.somatoria()
    println("Soma dos salarios: $totalSalario")

    val gastoTotal = salarioComAumento.fold(totalSalario) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("Gasto em $meses meses: $gastoTotal")

    val mediaTresMaiores = salarioComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println("Media dos 3 maiores salarios: $mediaTresMaiores")

    var mediaTresMenores = salarioComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println("Media dos 3 menores salarios: $mediaTresMenores")

}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}