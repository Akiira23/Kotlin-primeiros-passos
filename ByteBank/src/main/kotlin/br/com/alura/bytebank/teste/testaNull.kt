package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaNull() {
    var endereco: Endereco? = Endereco(logradouro = "Rua teste", complemento = "predio")
    endereco?.let { enderecoNaoNulo ->
        println(enderecoNaoNulo.logradouro)
        val tamanhoComplemento: Int =
            enderecoNaoNulo.complemento?.length ?: throw IllegalStateException("Complemento nao pode ser vazio")
        println(tamanhoComplemento)
    }
    teste("")
    teste(2)
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int  // se nao conseguir converter devolve null
    println(numero)
}