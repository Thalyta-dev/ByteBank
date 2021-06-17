package br.com.alura.bytebank.teste

import modelo.Autenticavel

val fran = object : Autenticavel {
    val nome: String = "fran"
    val cpf: String = "111.111.111-11"
    val senha: Int  = 100

    override fun autenticacao(senha: Int) = this.senha == senha
}

