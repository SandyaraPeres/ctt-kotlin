package model

interface ResponseListener {
    fun onSuccess(requisicao: String)

    fun onError(error: Error)
}