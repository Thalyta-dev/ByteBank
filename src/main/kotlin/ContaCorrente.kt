class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(valor: Double) {

        if (saldo >= valor) {

            this.saldo -= valor;

            println("Foi sacado $valor na sua conta, saldo atual ${this.saldo}")
            return

        }
    }
}