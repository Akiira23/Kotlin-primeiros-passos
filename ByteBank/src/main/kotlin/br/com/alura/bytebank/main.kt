import br.com.alura.bytebank.modelo.Endereco

fun main() {
    funcaoMain()
}

private fun funcaoMain() {
    println("início main")

    val entrada: String = "1,9"
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: java.lang.NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valor != null){
        valor + 0.3
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor invalido")
    }

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    try {
        for (i in 1..5) {
            println(i)
            val endereco = Any()
            endereco as Endereco
        }
    } catch (e: java.lang.ClassCastException) {
//        println(e.message)
//        println(e.stackTrace)
//        println(e.cause)
        e.printStackTrace()
        println("Class exception")
    }
    println("fim funcao2")
}
