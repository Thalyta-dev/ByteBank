fun main() {

    var conta = Conta("Alex", 10)
    conta.depositar(200.0)

    var conta2 = Conta("jose", 20)
    conta2.depositar(200.0)


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