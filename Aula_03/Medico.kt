data class Medico(
    val nomeMedico: String,
    val cpfMedico: String,
    val dataNascimentoMedico : String,
    val crm : String
    ) : Pessoa(
    nome = nomeMedico,
    cpf = cpfMedico,
    dataNascimento = dataNascimentoMedico){

    fun plantao() : String {
        return "Você esta em plantao"
    }

    override fun twittar(): String {
        return super.twittar()
    }

}
