fun main() {

    var conta = Conta()
    conta.titular = "Alex"
    conta.numero = 10
    conta.saldo = 20.0


    var conta2 = Conta()
    conta2.titular = "jose"
    conta2.numero = 10
    conta2.saldo = 20.0


    conta.sacar(20.0)

    conta.depositar(20.0)


    conta.tranferir(conta2, 10.0);

    println("Alex ${conta.saldo}")
    println("jose ${conta2.saldo}")

}


fun testaCondicoes(saldo: Double) {

    when {

        saldo > 0.0 -> println("Conta positiva")
        saldo < 0.0 -> println("Conta negativa")

        else -> {
            println("Conta neutra")
        }
    }

}

fun testaLacos() {


    for (i in 5 downTo 1 step 2) {

        var titular = "Thalyta $i"

        val numeroConta = 1000 + i

        var saldo = 10.0 + i

        println("tilular $titular")
        testaCondicoes(saldo)

    }
    var i = 0

    while (i < 5) {

        var titular = "Thalyta $i"

        val numeroConta = 1000 + i

        var saldo = 10.0 + i

        println("tilular $titular")
        testaCondicoes(saldo)
        i++
    }

    do {


        var titular = "Thalyta $i"

        val numeroConta = 1000 + i

        var saldo = 10.0 + i

        println("tilular $titular")
        testaCondicoes(saldo)
        i++

    } while (i < 5)


}