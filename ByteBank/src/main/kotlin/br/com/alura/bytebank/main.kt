import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("Bem vindo ao ByteBank!")
    println()


    val endereco = Endereco(logradouro = "Rua Vergueiro", numero = 715, complemento = "apto 312", estado = "Sao Paulo")
    val enderecoNovo = Endereco(logradouro = "Av. Paulista", numero = 2012, cidade = "Sao Paulo")
    println(endereco.equals(endereco))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
    println(enderecoNovo.toString())
}

fun imprime(valor: Any) {

}
