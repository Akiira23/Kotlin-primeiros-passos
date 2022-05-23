package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
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

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    override fun transfere(destino: Conta, valor: Double, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "Saldo insuficiente, saldo atual: $saldo e valor transferido: $valor")
        }
        saldo -= valor
        destino.deposita(valor)

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
    }
}