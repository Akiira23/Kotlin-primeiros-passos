package br.com.alura.bytebank.arrays

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        "- ${it.titulo} de ${it.autor} em ${it.anoPublicacao}"
    }
    println(" #### Lista de Livros #### \n$textoFormatado")
}