fun testaRepeticao() {
    for (i in 7 downTo 1 step 1) {
        if (i == 6) continue
        if (i == 3) break
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        val saldo = 100.0 + 10.0 * i

        println("titular: $titular")
        println("numero da conta: $numeroConta")
        println("saldo: $saldo")
        println()

    }
    var i = 0
    while (i < 5) {
        println("while $i")
        i++
    }
}