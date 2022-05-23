import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopias() {
    val contaAlex = ContaPoupanca(Cliente("Alex", "111111", senha = 123), numero = 100)
    contaAlex.deposita(100.00)

    val contaFran = ContaCorrente(Cliente("Fran", "2222222", senha = 123), numero = 101)
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

    println()

    println("sacando na conta do Alex 151")
    contaAlex.saca(151.0)
    println(contaAlex.saldo)

    println("sacando na conta do Fran 100")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println()

    println("Fran transfere 100 para Alex")

    try {
        contaFran.transfere(contaAlex, 100.0)
        println("Tranferencia bem sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Tranferencia mal sucedida")
        println("Saldo insuficiente")
        e.printStackTrace()
    }


    println("saldo Fran: ${contaFran.saldo}")
    println("saldo Alex: ${contaAlex.saldo}")

}