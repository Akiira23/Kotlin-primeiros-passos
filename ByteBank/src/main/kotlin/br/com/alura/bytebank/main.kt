import br.com.alura.bytebank.exception.SaldoInsuficienteException

fun main() {
    funcaoMain()
}

private fun funcaoMain() {
    println("início main")
    testaCopias()

    //funcao1()
    println("fim main")
}


fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("Saldo insuficiente foi pegado")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}
