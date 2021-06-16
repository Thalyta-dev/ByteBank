interface Autenticavel {

    val senha: Int

    fun autenticacao(senha: Int): Boolean {

        if(this.senha == senha){
            return true
        }
        return false


    }
}