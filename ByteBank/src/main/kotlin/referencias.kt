fun referencias() {
    val contaJoao = Conta("Joao", 1)
    val contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}