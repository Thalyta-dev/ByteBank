class Diretor(

    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    var plr:Double

) : Funcionario(

    nome = nome,
    cpf = cpf,
    salario = salario

) {

    override val bonificacao: Double
        get() {
            return salario * 0.3
        }
    fun autenticacao(senha: Int) {


    }
}