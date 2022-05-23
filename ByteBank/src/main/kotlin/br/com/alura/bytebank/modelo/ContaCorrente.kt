package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
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