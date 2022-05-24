package br.com.alura.bytebank.collection

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos = banco.nomes
    banco.salva("Alex")
    println(nomesSalvos)
    println(banco.nomes)
    println(BancoDeNomes().nomes)  //companion object manter os dados
}

class BancoDeNomes {

    val nomes: Collection<String> get() = _nomes.toList()

    fun salva(nome: String) {
        _nomes.add(nome)
    }

    companion object {
        private val _nomes = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf("Alex", "Fran", "Gui", "Maria", "Ana")
    for (nome in nomes) {
        println(nome)
    }
//    nomes.add("Paulo")
//    nomes.remove("Alex")
    println("contem o Alex: ${nomes.contains("Alex")}")
    println("tamanho da colecao: ${nomes.size}")
}