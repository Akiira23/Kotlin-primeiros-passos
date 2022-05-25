package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("falha na autenticacao")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()    //this.autenticado(this), poderia ser feita de qualquer uma das duas formas tambem
        } else {
            println("falha na autenticacao")
        }
    }

    fun pagamento(){
        println("realizando pagamento")
    }
}