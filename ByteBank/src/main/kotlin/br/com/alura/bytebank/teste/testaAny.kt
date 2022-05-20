package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco
fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        numero = 715,
        complemento = "apto 312",
        estado = "Sao Paulo",
        cep = "0000"
    )
    val enderecoNovo = Endereco(logradouro = "Av. Paulista", numero = 2012, cidade = "Sao Paulo", cep = "0000")

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
    println(enderecoNovo.toString())
}