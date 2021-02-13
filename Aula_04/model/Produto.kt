package model

sealed class Produto(val vendedor: String, val valor: Double)

class Flauta(vendedorFlauta: String,
             valorFlauta: Double,
             possuiCordasFlauta: Boolean) : Produto(
    vendedor = vendedorFlauta,
    valor = valorFlauta), Instrumento{

    override var possuiCordas: Boolean = possuiCordasFlauta

    override fun emitirSom(): String {
        return "fluuuuuuu"
    }

}