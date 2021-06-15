fun main() {

    var titular = "Thalyta "
    val numeroConta = 1000
    var saldo = 0.0


    when {

        saldo > 0.0 -> println("Conta positiva")
        saldo < 0.0 -> println("Conta negativa")

        else -> {
            println("Conta neutra")
        }
    }

    println("tilular $titular")

}