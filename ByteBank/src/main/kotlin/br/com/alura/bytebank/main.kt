import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {
    testaHighOrderFunction()
}

fun testaHighOrderFunction() {           //apply e also retornam o objeto do contexto. let, run e with retornam um lambda
    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
    Endereco(
        logradouro = "rua vergueiro",
        numero = 3185
    ).let { endereco ->                                                       //se for o ultimo ou o unico argumento a expressao lambda nao precisa estar nos ()
        "${endereco.logradouro}, ${endereco.numero}".toUpperCase()            // caso nao queira criar uma variavel use o let
    }
        .let(::println)                                                          //como let recebe generics pode enviar uma referencia de uma funcao como argumento

    listOf(Endereco(complemento = "casa"), Endereco(), Endereco(complemento = "apartamento"))
        .filter { endereco -> endereco.complemento != null }
        .let(::println)

    soma(5, 7) { valor ->           //soh quando o evento "resultado" acontecer ele sera executado
        println(valor)                    //pode ser dessa forma, fora da chamada
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }
    SistemaInterno().entra(autenticavel, 1234, autenticado = {            //pode ser dessa forma, dentro da chamada
        println("realizar pagamento")         //soh executa a high order function depois que o usuario foi autenticado
    })

    with(endereco) {                     //pegar um objeto e trabalhar com seus elementos membros ou quer devoler algo ou nada
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoMaiusculo -> println(enderecoMaiusculo) }

    val numeroEndereco =
        endereco.run {                      //quando eh necessario realizar inicializacoes e computacoes
            endereco.numero = 800
            endereco
        }
    println(numeroEndereco)

    val enderecoNovo = Endereco(logradouro = "rua do matao").also {
        println("Criando endereco novo")
    }.apply {
        numero = 100
        complemento = "predio"
    }
    println(enderecoNovo)


}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Soma sendo efetuada")
    resultado(a + b)
    println("depois da som")
}

fun testeIntro() {
    "".let(::testeRecebeString)

    teste(1) {}   //se for o ultimo ou o unico argumento a expressao lambda nao precisa estar nos ()
}

fun testeRecebeString(valor: String) {

}

//high order function (uma funcao recebendo outra)
fun teste(teste: Int, bloco: () -> Unit) {}


// let: Opera com o resultado de uma ou mais funcoes e com valores nulos
// with: chama membros do objeto de contexto diretamente e tambem eh utilizado para computar algo com esse recptor e retorna um valor
// run: utiliza a inicializacao de um ojeto e retorna uma computacao do objeto (proposta similar do let, mas o uso eh parecido com o with)
// apply: recebe e retorna o objeto de contexto, configura o objeto sem fazer computacoes
// also: realiza acoes a mais que nao modificam o objeto (also nao deve afetar o programa)

// executar um lambda em objetos nao nulos: let()
// introduzindo uma expressao como uma variavel no escopo local: let()

// configuracao de objeto: apply()

// configuracao do objeto e computacao do resultado: run()
// execucao de instrucao quando a expressao eh necessaria" run() - sem extensao

// execucoes adicionais sem afetar o programa: also()

// agrupamento de chamadas de funcao em um objeto: with()





