import java.sql.DriverManager.println

open class Conta(

    var titular: String,
    var numero: Int,

    ){

    var saldo = 0.0
        private set


    fun depositar(valorDeposito: Double){

        this.saldo = valorDeposito;

        println("Foi depositado $valorDeposito na sua conta, saldo atual ${this.saldo}")
        return

    }

    open fun sacar(valorSaque: Double) {


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

