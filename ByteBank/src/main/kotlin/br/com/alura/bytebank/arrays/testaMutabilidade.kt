package br.com.alura.bytebank.arrays

fun testaMutabilidade() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaLivros())
    val organizarPorAutor = prateleira.organizarPorAutor()
    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    organizarPorAutor.imprimeComMarcadores()
    organizarPorAnoPublicacao.imprimeComMarcadores()
}