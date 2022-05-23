import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {


    val contaCorrente = ContaCorrente(Cliente("Alex", "111111", senha = 123), 1000)
    val contaPoupanca = ContaPoupanca(Cliente("Fran", "222222", senha = 123), 1001)
    val contaSalario = ContaSalario(Cliente("Teste", "3333333", senha = 123, endereco = Endereco(logradouro = "Rua Vergueiro")), 1002)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(2000.0)

    println("conta corrente ${contaCorrente.titular.nome}: ${contaCorrente.saldo}")
    println("conta poupanca ${contaPoupanca.titular.nome}: ${contaPoupanca.saldo}")
    println("conta salario ${contaSalario.titular.nome}: ${contaSalario.saldo}")
    println("conta salario rua: ${contaSalario.titular.endereco.logradouro}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("conta corrente: ${contaCorrente.saldo}")
    println("conta poupanca: ${contaPoupanca.saldo}")
    println("conta salario: ${contaSalario.saldo}")

    contaCorrente.transfere(contaPoupanca, 100.0, 123)

    println("conta corrente transfere 100: ${contaCorrente.saldo}")
    println("conta poupanca recebe 100: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(contaCorrente, 100.0, 123)

    println("conta corrente recebe 100: ${contaCorrente.saldo}")
    println("conta poupanca transfere 100: ${contaPoupanca.saldo}")

    //println("total de contas: ${contaSalario.total}")
}