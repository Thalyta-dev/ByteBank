class ContaPoupanca(

    titular: String,
    numero: Int
):
    Conta(
        titular = titular,
        numero = numero
    ) {

    override fun sacar(valorSaque: Double) {
        val valorTaxado = valorSaque + 0.1
        super.sacar(valorTaxado)
    }
}