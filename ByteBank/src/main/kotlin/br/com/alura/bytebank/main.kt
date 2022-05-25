import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaisculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaisculo)
    Endereco(
        logradouro = "rua vergueiro",
        numero = 3185
    ).let { endereco ->        //se for o ultimo ou o unico argumento a expressao lambda nao precisa estar nos ()
        "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }.let(::println)        //como let recebe generics pode enviar uma referencia de uma funcao como argumento

    listOf(Endereco(complemento = "casa"), Endereco(), Endereco(complemento = "apartamento"))
        .filter { endereco -> endereco.complemento != null }
        .let(::println)

    soma(5,7) {valor ->  //soh quando o evento "resultado" acontecer ele sera executado
        println(valor)                 //pode ser dessa forma, fora da chamada
    }

    val autenticavel = object: Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }
    SistemaInterno().entra(autenticavel, 1234, autenticado = {            //pode ser dessa forma, dentro da chamada
        println("realizar pagamento")         //soh executa a high order function depois que o usuario foi autenticado
    })
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








