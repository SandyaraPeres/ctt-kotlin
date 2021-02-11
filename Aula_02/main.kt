
fun main() {
//    var readLine : Int?
//    var scanner: Int?
//
      //Permite valores nulos e outros formatos de caracteres enquanto Scanner, não.
//    println("Testando método readline()")
//    readLine = readLine()?.toIntOrNull()
//
//    println("Testando método scanner")
//    scanner = Scanner(System.`in`).nextInt()
//
//    println(readLine)
//    println(scanner)

    //Aula 02 - Biblioteca
    //Livro harrypotter = new Livro("",""...);

    var livro3 : Livro? = null

    val livro1 = Livro(
        titulo = "Harry Potter e a Pedra Filosofal",
        autor ="J. K. Rowling",
        editora ="Saraiva",
        numeroPaginas = 200,
        seEstaAlugado = true)

    val livro2 = Livro(
        titulo = "Capitães de Areia",
        autor ="Jorge Amado",
        editora ="Saraiva",
        numeroPaginas = 150,
        seEstaAlugado = true)

    println(livro1)
    println(livro1.getTitulo())

    var listaLivros : MutableList<Livro> = mutableListOf(livro1, livro2)

    val resultado = Soma(2,2).somar()

    val carro1 = Carro(nome = "ABC", placa = "XPTO")
    val carro2 = Carro(nomeInserido = "DEF", placaInserida = "ABCD", modeloNovo = true)

    println("${carro1.nome}, ${carro1.placa}")

    //Só exibe de forma completa no log se for um data class!!
    println(carro1)

    val tipo = EnumTiposPokemon.FOGO

    val mensagem = when(tipo){
        EnumTiposPokemon.FOGO -> "Tá pegando fogo, bicho!"
        EnumTiposPokemon.DRAGAO -> "Dragão"
        else -> "Alguma coisa..."
    }

    println(mensagem)

    val casa = Imovel(valor = 350000.00, qtdQuartos = 2, endereco = "Onde judas perdeu as botas")
    val apartamento = Imovel(valor = 4600000.00, qtdQuartos = 5, endereco = "Também onde judas perdeu as botas", numeroAndares = 8)

}
