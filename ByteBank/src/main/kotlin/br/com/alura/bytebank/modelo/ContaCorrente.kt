package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
), Transferivel {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        } else {
            println("saldo invalido.")
        }
    }

    override fun transfere(destino: Conta, valor: Double) {
        if (saldo < valor) {
            throw SaldoInsuficienteException()
        }
        saldo -= valor
        destino.deposita(valor)
    }


}