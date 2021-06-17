import modelo.Cliente
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular = Cliente("fran", "123",123)
    ,
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente("jose", "123",123),
        numero = 1001
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.tranferir(valorTranferencia = 100.0,contaTransferencia =  contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.tranferir(valorTranferencia = 200.0, contaTransferencia = contaPoupanca)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}