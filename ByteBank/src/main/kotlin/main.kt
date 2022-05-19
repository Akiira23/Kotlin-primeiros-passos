class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("saldo invalido.")
        }
    }

    fun transfere(destino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    fun getSaldo(): Double {
        return saldo
    }
    fun setSaldo(valor: Double) {
        if (valor > 0) {
            saldo = valor
        }
    }
}

fun main() {
    println("Bem vindo ao ByteBank!")

    testaCopias()
}

private fun testaCopias() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 100
    contaAlex.setSaldo(100.00)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 101
    contaFran.setSaldo(500.00)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.getSaldo())
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.getSaldo())

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.getSaldo())

    println("depositando na conta do Fran")
    contaFran.deposita(75.0)
    println(contaFran.getSaldo())

    println("sacando na conta do Alex")
    contaAlex.saca(151.0)
    println(contaAlex.getSaldo())

    println("sacando na conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.getSaldo())

    println("Fran transfere 100 para Alex")
    if (contaFran.transfere(contaAlex, 100.0)) {
        println("Tranferencia bem sucedida")
    } else {
        println("Tranferencia mal sucedida")
    }
    println("saldo Fran: ${contaFran.getSaldo()}")
    println("saldo Alex: ${contaAlex.getSaldo()}")

}

private fun referencias() {
    val contaJoao = Conta()
    contaJoao.titular = "Joao"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
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