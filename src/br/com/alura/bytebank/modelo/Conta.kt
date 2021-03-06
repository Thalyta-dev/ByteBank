package modelo
abstract class Conta(

    var titular: Cliente,
    var numero: Int,

    ){

    var saldo = 0.0
        protected set

    companion object contador {

        var total = 0
            private  set

    }

    init {
        total++
    }

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

