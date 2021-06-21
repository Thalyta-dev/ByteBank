package modelo

import modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autenticacao(senha = senha)){
            println("Bem vindo ao ByteBank")
        }else{
            println("Autenticação falhou")
        }
    }
}