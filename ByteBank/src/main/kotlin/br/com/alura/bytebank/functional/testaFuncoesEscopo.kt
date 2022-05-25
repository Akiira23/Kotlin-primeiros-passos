import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaFuncoesComReceiver() {
    somaReceiver(5, 2, resultado = {
        println(it)
        println(this)
    })
}

fun somaReceiver(a: Int, b: Int, resultado: Int.(String) -> Unit) {
    println("Soma sendo efetuada")
    val total = a + b
    total.resultado("string retorno")
    println("depois da soma")
}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal: $taxaMensal")

    val novaConta = ContaPoupanca(
        Cliente(
            nome = "Alex", cpf = "11111", senha = 1234
        ), 1000
    )
    novaConta.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let {
        println("Rendimento mensal: $it")
    }

    val rendimentoAnual = run {
        var saldo = novaConta.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulacao rendimento anual: $rendimentoAnual")
}

fun testaWith() {
    val enderecoCompleto = with(Endereco()) {
        logradouro = "rua do matao"
        numero = 120
        bairro = "butanta"
        cidade = "Sao Paulo"
        estado = "SP"
        cep = "021578914"
        complemento = "predio"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
