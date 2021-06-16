class Diretor(

    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    var plr:Double

) : FuncionarioAdmin(

    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha,

), Autenticavel {

    override val bonificacao: Double get() = salario + plr



}