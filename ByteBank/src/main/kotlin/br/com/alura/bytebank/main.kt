fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
    val minhaFuncaoLambda = {          //: () -> Unit
        println("executa como o lambda")
    }
    println(minhaFuncaoLambda())
    val minhaFuncaoAnonima: () -> Unit = fun() {          //: () -> Unit
        println("executa como anonima")
    }
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClass =
        Teste()  //funciona por causa do invoke, nao necessariamente precisa colocar o tipo funcao (: () -> Unit)
    println(minhaFuncaoClass())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste    // funcao -> tipo de retorno = ::referencia da funcao
    println(minhaFuncao())
}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do teste")
    }

}










