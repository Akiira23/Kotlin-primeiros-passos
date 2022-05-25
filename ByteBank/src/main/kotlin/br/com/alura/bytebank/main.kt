fun main() {
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()

    testaFuncaoLambda()
    testaFuncaoAnonima()

    testaFuncaoLambdaMultiplos()
    testaFuncaoAnonimaMultiplos()
}

private fun testaFuncaoAnonimaMultiplos() {
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1100.0))
}

private fun testaFuncaoLambdaMultiplos() {
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000) {
            return@lambda salario + 50
        }
        salario + 100.0
    }
    println(calculaBonificacao(1100.0))
}

private fun testaFuncaoAnonima() {    //utiliza-se quando quer ter certeza o que quer retornar, pois ela nao retorna a ultima instrucao e sim o return
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {          //: () -> Unit, funcao sem nome
        return a + b                                               // pode utilizar o "_" como na lambda e : () -> Unit, omitir e colocar os argumentos dentro das {}
    }
    println("Funcao Anonima: ${minhaFuncaoAnonima(8, 13)}")
}

private fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { x: Int, y: Int ->    //: () -> Unit, omitir e colocar os argumentos dentro das {}
        x + y                                             //a ultima instrucao eh quem determina o retorno
    }                                               // _,_ se nao quer utilizar um dos parametros da lambda ex: _, b -> b + 10
    println("Funcao lambda: ${minhaFuncaoLambda(17, 22)}")
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClass = Soma()  //funciona por causa do invoke,
    // nao necessariamente precisa colocar o tipo funcao (: () -> Unit)

    println("Tipo classe: ${minhaFuncaoClass(7, 5)}")
}

class Soma : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma    // funcao -> tipo de retorno = ::referencia da funcao,
    // nao precisa da inicializacao (: (Int, Int) -> Int), o kotlin pega os argumentos da funcao chamada

    println("Tipo funcao: ${minhaFuncao(3, 5)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}










