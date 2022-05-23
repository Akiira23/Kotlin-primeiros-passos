package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
), Transferivel {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
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