import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "1,9"
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valor != null) {
        valor + 0.3
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor invalido")
    }
}