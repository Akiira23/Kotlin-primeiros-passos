package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int = 0  //valor padrao
) : Autenticavel {
    var saldo = 0.0
        protected set
    companion object {            //companion object, eh como se fossse um membro da classe
        var total = 0
            private set
    }

    init {             //executa o codigo no momento em que a classe eh construida
        total++
    }
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}