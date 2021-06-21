package modelo

import modelo.Funcionario

class Gerente : Autenticavel, FuncionarioAdmin {

    constructor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int

    ) : super(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha
    ) {


    }
    override val bonificacao: Double get() =  salario



    override fun autenticacao(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }



}