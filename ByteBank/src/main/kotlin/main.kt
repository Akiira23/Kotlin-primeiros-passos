fun main() {
    println("Bem vindo ao ByteBank!")
    println()

    val contaCorrente = ContaCorrente("Alex", 1000)
    val contaPoupanca = ContaPoupanca("Fran", 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("conta corrente: ${contaCorrente.saldo}")
    println("conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("conta corrente: ${contaCorrente.saldo}")
    println("conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(contaPoupanca, 100.0)

    println("conta corrente transfere 100: ${contaCorrente.saldo}")
    println("conta poupanca recebe 100: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(contaCorrente, 100.0)

    println("conta corrente recebe 100: ${contaCorrente.saldo}")
    println("conta poupanca transfere 100: ${contaPoupanca.saldo}")
}