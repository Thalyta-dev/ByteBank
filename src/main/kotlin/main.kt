fun main() {

    for (i in 5 downTo 1 step 2) {

        var titular = "Thalyta $i"

        val numeroConta = 1000 + i

        var saldo = 10.0 + i

        println("tilular $titular")
        testaCondicoes(saldo)

    }
    var i = 0

    while (i < 5){

        var titular = "Thalyta $i"

        val numeroConta = 1000 + i

        var saldo = 10.0 + i

        println("tilular $titular")
        testaCondicoes(saldo)
        i++
    }

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