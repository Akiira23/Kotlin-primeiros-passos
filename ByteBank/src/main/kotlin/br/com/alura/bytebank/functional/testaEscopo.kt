package br.com.alura.bytebank.functional

import br.com.alura.bytebank.modelo.Endereco

fun testaEscopo(endereco: Endereco) {
    with(endereco) {                     //pegar um objeto e trabalhar com seus elementos membros ou quer devoler algo ou nada
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoMaiusculo -> println(enderecoMaiusculo) }

    val numeroEndereco =
        endereco.run {                      //quando eh necessario realizar inicializacoes e computacoes
            endereco.numero = 800
            endereco
        }
    println(numeroEndereco)

    val enderecoNovo = Endereco(logradouro = "rua do matao").also {
        println("Criando endereco novo")
    }.apply {
        numero = 100
        complemento = "predio"
    }
    println(enderecoNovo)
}