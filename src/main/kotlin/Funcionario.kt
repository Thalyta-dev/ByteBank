abstract class Funcionario(

    val nome: String,
    val cpf: String,
    var salario: Double


) {
    abstract val bonificacao: Double

    interface Autenticavel {

        val senha: Int

        fun autenticacao(senha: Int): Boolean {

            if(this.senha == senha){
                return true
            }
            return false


        }
    }

}