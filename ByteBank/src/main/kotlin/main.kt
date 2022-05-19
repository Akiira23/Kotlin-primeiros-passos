fun main() {
    println("Bem vindo ao ByteBank!")

    val titular = "Alex"
    val numeroConta = 1000
    var saldo = 0.0
    saldo += 100
    saldo += 57
    saldo = -20.0

    println("titular: $titular")
    println("numero da conta: $numeroConta")
    println("saldo: $saldo")

    when {
        saldo > 0 -> println("saldo positivo.")
        saldo == 0.0 -> println("saldo neutro.")
        else -> println("saldo negativo.")
    }
}