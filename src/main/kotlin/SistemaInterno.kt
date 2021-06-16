class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autenticacao(senha = senha)){
            println("Bem vindo ao ByteBank")
        }else{
            println("Autenticação falhou")
        }
    }
}