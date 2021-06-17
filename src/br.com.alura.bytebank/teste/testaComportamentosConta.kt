package br.com.alura.bytebank.teste

import modelo.Cliente
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)

    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.depositar(200.0)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.depositar(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.depositar(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.depositar(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.sacar(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.sacar(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.sacar(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.sacar(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    println(contaAlex.saldo)
    println(contaFran.saldo)
}