class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun main() {
    println("Bem vindo ao ByteBank!")

    testaCopiasEReferencias()

}

private fun testaCopiasEReferencias() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 100
    contaAlex.saldo = 100.00

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 101
    contaFran.saldo = 500.00

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("depositando na conta do Alex")
    deposita(contaAlex, 50.0)
    println(contaAlex.saldo)
    println("depositando na conta do Fran")
    deposita(contaFran, 75.0)
    println(contaFran.saldo)

//    val contaJoao = Conta()
//    contaJoao.titular = "Joao"
//    var contaMaria = contaJoao
//    contaMaria.titular = "Maria"
//
//    println("titular conta joao: ${contaJoao.titular}")
//    println("titular conta maria: ${contaMaria.titular}")
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}

private fun testaRepeticao() {
    for (i in 7 downTo 1 step 1) {
        if (i == 6) continue
        if (i == 3) break
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = 100.0 + 10.0 * i

        println("titular: $titular")
        println("numero da conta: $numeroConta")
        println("saldo: $saldo")
        println()

    }
    var i = 0
    while (i < 5) {
        println("while $i")
        i++
    }
}

private fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0 -> println("saldo positivo.")
        saldo == 0.0 -> println("saldo neutro.")
        else -> println("saldo negativo.")
    }

    if (saldo > 0) {
        println("saldo positivo.")
    } else if (saldo == 0.0) {
        println("saldo neutro.")
    } else {
        println("saldo negativo.")
    }
}