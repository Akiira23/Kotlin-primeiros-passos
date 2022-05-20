import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("Bem vindo ao ByteBank!")
    println()


    val endereco = Endereco()
    imprime(Any())
    imprime(1)
    imprime(1.0)
    imprime(endereco)
}

fun imprime(valor: Any) {
    println(valor)
}
