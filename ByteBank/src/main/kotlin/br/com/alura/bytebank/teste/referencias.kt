import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun referencias() {
    val joao = Cliente("Joao","11111",senha = 123)
    val maria = Cliente("Maria","222222",senha = 123)
    val contaJoao = ContaPoupanca(joao, 1)
    val contaMaria = contaJoao
    contaMaria.titular = maria

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}