abstract class Pessoa(val nome: String,
                  val cpf: String,
                  val dataNascimento: String){
    fun falar() : String {
        return "Oi!"
    }

    protected open fun twittar() : String {
        return "Hoje vou falar muito de BBB!"
    }
}
