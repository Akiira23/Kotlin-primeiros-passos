class Conta(
    var titular: String,
    val numero: Int = 0  //valor padrao
) {
    var saldo = 0.0
        private set

//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
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

//    fun getSaldo(): Double {
//        return saldo
//    }
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//    }
}

fun main() {
    println("Bem vindo ao ByteBank!")

    testaCopias()
}

private fun testaCopias() {
    val contaAlex = Conta(titular = "Alex", numero = 100)
    contaAlex.deposita(100.00)

    val contaFran = Conta(titular = "Fran", numero = 101)
    contaFran.deposita(500.00)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta do Fran")
    contaFran.deposita(75.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(151.0)
    println(contaAlex.saldo)

    println("sacando na conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Fran transfere 100 para Alex")
    if (contaFran.transfere(contaAlex, 100.0)) {
        println("Tranferencia bem sucedida")
    } else {
        println("Tranferencia mal sucedida")
    }
    println("saldo Fran: ${contaFran.saldo}")
    println("saldo Alex: ${contaAlex.saldo}")

}

private fun referencias() {
    val contaJoao = Conta("Joao", 1)
    val contaMaria = contaJoao
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
        val saldo = 100.0 + 10.0 * i

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