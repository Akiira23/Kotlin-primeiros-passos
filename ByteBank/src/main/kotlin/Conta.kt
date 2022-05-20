open class Conta(
    var titular: String,
    val numero: Int = 0  //valor padrao
) {
    var saldo = 0.0
        private set

//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("saldo invalido.")
        }
    }

    fun transfere(destino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}