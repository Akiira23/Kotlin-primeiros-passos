import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "11111111"
        val senha: Int = 111

        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 111)
    println("nome: ${fran.nome}")

    testaContasDiferentes()
    println("total de contas: ${Conta.total}")
}