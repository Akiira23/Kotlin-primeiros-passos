package br.com.alura.bytebank.modelo

interface Transferivel {
    fun transfere(destino: Conta, valor: Double, senha: Int)
}