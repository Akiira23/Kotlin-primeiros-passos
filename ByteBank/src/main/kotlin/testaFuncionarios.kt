fun testaFuncionario() {
    val alex = Auxiliar(
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

    val gui = Diretor(
        nome = "Gui",
        cpf = "125.762.242-81",
        salario = 5500.00,
        senha = 123,
        plr = 200.0
    )
    println()
    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: ${gui.salario}")
    println("bonificacao: ${gui.bonificacao()}")
    println("PLR: ${gui.plr}")
    if (gui.autentica(1234)) {
        println("autenticado")
    } else {
        println("nao autenticado")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "854.123.222-33",
        salario = 2500.00
    )
    println()
    println("nome: ${maria.nome}")
    println("cpf: ${maria.cpf}")
    println("salario: ${maria.salario}")
    println("bonificacao: ${maria.bonificacao()}")
    println()

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total bonificacao: ${calculadora.total}")
}