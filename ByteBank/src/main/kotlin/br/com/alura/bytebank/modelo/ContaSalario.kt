package br.com.alura.bytebank.modelo

class ContaSalario(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
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
}