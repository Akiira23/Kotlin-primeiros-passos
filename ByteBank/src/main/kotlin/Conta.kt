abstract class Conta(
    var titular: String,
    val numero: Int = 0  //valor padrao
) {
    var saldo = 0.0
        protected set
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }
    abstract fun saca(valor: Double)
}