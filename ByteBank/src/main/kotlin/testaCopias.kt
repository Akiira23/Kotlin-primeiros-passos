fun testaCopias() {
    val contaAlex = ContaPoupanca(titular = "Alex", numero = 100)
    contaAlex.deposita(100.00)

    val contaFran = ContaCorrente(titular = "Fran", numero = 101)
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