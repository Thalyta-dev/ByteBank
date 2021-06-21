fun main() {

    soma(1,2) {
        print(it)
    }
}


fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("soma efutada")
    resultado(1+2)
}
