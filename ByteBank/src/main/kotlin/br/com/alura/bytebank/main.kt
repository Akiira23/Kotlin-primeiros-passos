import br.com.alura.bytebank.arrays.Livro

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "Guimarães Rosa",
        anoPublicacao = 1956
    )
    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )
    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )
    val livro4 = Livro(
        titulo = "Iracema",
        autor = "Jose de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf<Livro>(livro1, livro2, livro3, livro4)
    livros.add(
        Livro(
            titulo = "A teste 1",
            autor = "Autor Teste",
            anoPublicacao = 2020
        )
    )
    livros.add(
        Livro(
            titulo = "A teste 2",
            autor = "Autor Teste",
            anoPublicacao = 2021
        )
    )
    livros.add(
        Livro(
            titulo = "A teste 3",
            autor = "Audtor Teste",
            anoPublicacao = 2018
        )
    )
    livros.imprimeComMarcadores()

    val ordenaAno = livros.sortedBy { it.anoPublicacao }
    ordenaAno.imprimeComMarcadores()

    val autorLivro = livros
        .filter { it.autor.startsWith("Autor") }
        .sortedBy { it.anoPublicacao }
    autorLivro.imprimeComMarcadores()

    val anoLivro = livros.filter { it.anoPublicacao > 1950 }
    anoLivro.imprimeComMarcadores()

    val autorTitulosLivro = livros
        .filter { it.autor.startsWith("Autor") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }             //map altera o tipo do retorno de lista de livros para lista de titulos (lista de string)
    println(autorTitulosLivro)

}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        "- ${it.titulo} de ${it.autor} em ${it.anoPublicacao}"
    }
    println(" #### Lista de Livros #### \n$textoFormatado")
}