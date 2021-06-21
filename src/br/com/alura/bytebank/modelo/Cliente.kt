package modelo

import br.com.alura.bytebank.modelo.Endereco


class Cliente(

    val nome: String,
    val cpf: String,
    private val senha: Int,
    val endereco: Endereco = Endereco()
): Autenticavel {

   override fun autentica(senha: Int): Boolean {

        if(this.senha == senha){
            return true
        }
        return false
   }

}