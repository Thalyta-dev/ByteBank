class Gerente : Funcionario {

    val senha: Int

    constructor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int

    ) : super(
        nome = nome,
        cpf = cpf,
        salario = salario
    ) {
        this.senha = senha
    }

    override val bonificacao: Double get() = super.bonificacao + salario



    fun autenticacao(senha: Int) {


    }
}