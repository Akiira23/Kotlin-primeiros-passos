fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0 -> println("saldo positivo.")
        saldo == 0.0 -> println("saldo neutro.")
        else -> println("saldo negativo.")
    }

    if (saldo > 0) {
        println("saldo positivo.")
    } else if (saldo == 0.0) {
        println("saldo neutro.")
    } else {
        println("saldo negativo.")
    }
}