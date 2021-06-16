
abstract class Conta(

    var titular: String,
    var numero: Int,

    ){

    var saldo = 0.0
        protected set


    fun depositar(valorDeposito: Double){

        this.saldo = valorDeposito;

        println("Foi depositado $valorDeposito na sua conta, saldo atual ${this.saldo}")
        return

    }

    abstract fun sacar(valorSaque: Double)


    fun tranferir(contaTransferencia: Conta, valorTranferencia: Double) {

        if (this.saldo >= valorTranferencia) {

            this.saldo -= valorTranferencia

            contaTransferencia.depositar(valorTranferencia);

            println(
                "Tranferencia no valor de $valorTranferencia foi realizada" +
                        " para titular ${contaTransferencia.titular}"
            )
            return
        }

        println("Tranferencia não realizada, saldo insuficiente")
    }

}

