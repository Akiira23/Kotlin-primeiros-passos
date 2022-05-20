package br.com.alura.bytebank.modelo

var totalContas = 0
    private set

abstract class Conta(
    var titular: Cliente,
    val numero: Int = 0  //valor padrao
) {
    var saldo = 0.0
        protected set
    var total = 0

    init {             //executa o codigo no momento em que a classe eh construida
        totalContas++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}