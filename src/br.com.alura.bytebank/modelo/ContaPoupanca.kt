package modelo

import modelo.Conta

class ContaPoupanca(

    titular: Cliente,
    numero: Int
):
    Conta(
        titular = titular,
        numero = numero
    ) {

    override fun sacar(valorSaque: Double) {

        var valorTaxado = valorSaque +  valorSaque * 0.1
        if (saldo >= valorTaxado) {

            this.saldo -= valorTaxado;

            println("Foi sacado $valorSaque na sua conta, saldo atual ${this.saldo}")
            return

        }
    }
}