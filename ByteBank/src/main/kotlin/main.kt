fun main() {
    println("Bem vindo ao ByteBank!")
    println()
    val alex = Funcionario(
        nome = "Alex",
        cpf = "444.111.222-33",
        salario = 1500.00
    )
    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificacao: ${alex.bonificacao()}")
    println()

    val fran = Gerente(
        nome = "Fran",
        cpf = "555.222.232-55",
        salario = 2500.00,
        senha = 1234
    )
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificacao: ${fran.bonificacao()}")
    if (fran.autentica(1234)) {
        println("autenticado")
    } else {
        println("nao autenticado")
    }
}







