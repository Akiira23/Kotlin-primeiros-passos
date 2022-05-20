fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111111111",
        salario = 1000.0,
        senha = 123
    )
    val diretora = Diretor(
        nome = "Fran",
        cpf = "22222222",
        salario = 2000.0,
        senha = 123,
        plr = 200.0
    )
    val cliente = Cliente(
        nome = "Alexandre",
        cpf = "222211111",
        senha = 1234
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 123)
    sistemaInterno.entra(diretora, 123)
}