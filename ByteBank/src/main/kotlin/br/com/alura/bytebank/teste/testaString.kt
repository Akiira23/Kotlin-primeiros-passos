package br.com.alura.bytebank.teste

fun testaString() {
    val palavra = "palavra"
    var palavraNova = palavra
    palavraNova = "palavra nova"

    println(palavra)
    println(palavraNova)

    for (c in palavra) {
        println(c == 'a')
    }

    val substring = palavra.substring(4)
    println(substring)
}