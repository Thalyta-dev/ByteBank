fun testaComportamentoConta() {
    var conta = Conta("Alex", 10)
    conta.depositar(200.0)

    var conta2 = Conta(titular = "jose", numero = 20)
    conta2.depositar(200.0)


    conta.sacar(20.0)

    conta.depositar(20.0)


    conta.tranferir(conta2, 10.0);

    println("Alex ${conta.saldo}")
    println("jose ${conta2.saldo}")
}
