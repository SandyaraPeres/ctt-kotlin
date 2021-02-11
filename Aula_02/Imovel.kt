data class Imovel (val valor: Double,
                   val qtdQuartos: Int,
                   val endereco: String) {

    var nmrAndares: Int? = null

    constructor(valor: Double,
                qtdQuartos: Int,
                endereco: String,
                numeroAndares: Int) : this(valor, qtdQuartos, endereco){
        nmrAndares = numeroAndares
    }
}