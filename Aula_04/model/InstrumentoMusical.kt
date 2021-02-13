package model

//Atributos não abstratos
abstract class InstrumentoMusical(val donoInstrumento: String,
                                  val valorInstrumento: Double){

    //Tudo que for abstrato, será SUBSTITUÍDO na classe em que for herdado
    //ex. guitarra

    //Atributos abstratos
    abstract var possuiCordas : Boolean

    //Métodos abstratos
    abstract fun emitirSom() : String

    //Métodos não abstratos
    fun comprar() : String {
        return "Compra realizada com sucesso!"
    }
}

class Guitarra(donoInstrumentoGuitarra: String,
               valorInstrumentoGuitarra: Double,
               possuiCordasGuitarra : Boolean) : InstrumentoMusical(
    donoInstrumento = donoInstrumentoGuitarra,
    valorInstrumento = valorInstrumentoGuitarra), TouchScreen, OutroExemplo{

    override var atributoQualquer: Int = 0

    override var possuiCordas: Boolean = possuiCordasGuitarra

    override fun emitirSom(): String {
        return "TÁÁÁÁ"
    }

    override fun tocar(): String {
        return "TÁÁÁÁ"
    }

}