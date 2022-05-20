package br.com.alura.bytebank.teste
fun testaDataClass() {
    val alex = Pessoa("Alex", 25)
    val alex2 = Pessoa("Alex", 25)
    alex.fala()
    println("comparacao pessoa " + alex.equals(alex2))

    val documento = Documento(
        rg = "11111",
        cpf = "55555"
    )
    val documento2 = documento.copy(rg = "1234")
    val (rg, cpf) = documento
    println(alex)
    println(documento)
    println(documento2)
    println("rg : $rg cpf : $cpf")
    println("comparacao docs " + documento.equals(documento2))
}

data class Documento(val rg: String, val cpf: String)

class Pessoa(val nome:String, val idade: Int) {
    fun fala() {
        println("emite som")
    }
}