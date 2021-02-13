import model.*

fun main() {
//    val soma: Calculadora = Soma()
//    val resultadoSoma = soma.calcular(2,2)
//
//    println("Soma: $resultadoSoma")
//
//    val subtracao: Calculadora = Subtracao()
//    val resultadoSubtracao = subtracao.calcular(2,2)
//
//    println("Subtracao: $resultadoSubtracao")
//
//    val divisao: Calculadora = Divisao()
//    val resultadoDivisao = divisao.calcular(2,2)
//
//    println("Divisao: $resultadoDivisao")
//
//    val multiplicacao: Calculadora = Multiplicaco()
//    val resultadoMultiplicacao = multiplicacao.calcular(2,2)
//
//    println("Multiplicacao: $resultadoMultiplicacao")

    val guitarra = Guitarra(donoInstrumentoGuitarra = "Chimbinha",
        valorInstrumentoGuitarra = 4000.00, possuiCordasGuitarra = true)

    println(guitarra.donoInstrumento)
    println(guitarra.valorInstrumento)
    println(guitarra.possuiCordas)
    println(guitarra.emitirSom())
    println(guitarra.comprar())

    //Vindos de uma interface
    guitarra.atributoQualquer
    guitarra.tocar()

    //Exemplo implementando somente interface + herança (herança multipla)
    val flauta = Flauta(vendedorFlauta = "MC Fioti", valorFlauta = 5.00, possuiCordasFlauta = false)
    println(flauta.vendedor)
    println(flauta.valor)
    println(flauta.possuiCordas)
    println(flauta.emitirSom())

    val listaFlauta : List<Flauta> = listOf(Flauta(vendedorFlauta = "MC Fioti", valorFlauta = 5.00, possuiCordasFlauta = false), Flauta(vendedorFlauta = "MC Fioti", valorFlauta = 5.00, possuiCordasFlauta = false))
    listaFlauta[1].emitirSom()
}