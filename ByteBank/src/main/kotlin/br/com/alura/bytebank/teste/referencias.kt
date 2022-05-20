import br.com.alura.bytebank.modelo.ContaPoupanca

fun referencias() {
    val contaJoao = ContaPoupanca("Joao", 1)
    val contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}