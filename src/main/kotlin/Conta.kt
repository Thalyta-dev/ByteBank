class Conta {

    var titular = ""

    var numero = 0

    var saldo = 0.0



    fun depositar(valorDeposito: Double){

        this.saldo = valorDeposito;

        println("Foi depositado $valorDeposito na sua conta, saldo atual ${this.saldo}")
        return

    }

    fun sacar(valorSaque: Double) {


        if (saldo >= valorSaque) {

            this.saldo -= valorSaque;

            println("Foi sacado $valorSaque na sua conta, saldo atual ${this.saldo}")
            return

        }

        println("Sua conta não tem saldo suficiente, saldo atual ${this.saldo}")



    }

    fun tranferir(contaTransferencia: Conta, valorTranferencia: Double) {

        if (this.saldo >= valorTranferencia) {

            this.saldo -= valorTranferencia

            contaTransferencia.saldo = contaTransferencia.saldo + valorTranferencia

            println(
                "Tranferencia no valor de $valorTranferencia foi realizada" +
                        " para titular ${contaTransferencia.titular}"
            )
            return
        }

        println("Tranferencia não realizada, saldo insuficiente")
    }

}

