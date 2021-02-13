package model

class Requisicao : ResponseListener {
    override fun onSuccess(requisicao: String) {
        println("Requisicao feita com sucesso! Pode ir ao login.")
    }

    override fun onError(error: Error) {
        println("Tente novamente mais tarde...")
    }

}