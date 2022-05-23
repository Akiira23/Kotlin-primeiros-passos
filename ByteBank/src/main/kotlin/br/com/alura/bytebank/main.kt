import br.com.alura.bytebank.arrays.Livro
import br.com.alura.bytebank.arrays.imprimeComMarcadores

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

    val livrosComNulos: MutableList<Livro?> = mutableListOf(null, livro1, livro2, null, livro3, livro4, null)
    livrosComNulos.imprimeComMarcadores()
}