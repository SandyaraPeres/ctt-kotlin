fun main() {

    //Aula 01 - vocês pensaram que não iam codar hoje né?

    //var: posso sobrescrever o valor atribuído
    //val: não posso sobreescrever o valor atribuído

//    //String
//    var nome = "Sandy"
//
//    //Inteiros (int)
//    val idade = 20
//
//    //Booleanos (boolean)
//    val souLegal = false
//
//    //Double (double)
//    val dinheiroNaMinhaConta = 0.00
//
//    //Inicializar por atribuição sem especificar o tipo
//    val possuiConta = true

//    //Inicialização especificando o tipo
//    var cnpj : String? = null
//    var idade: Int? = null
//
//    println("qual a sua idade?")
//    idade = readLine()?.toInt()
//    println(idade)
//
//    val provas : MutableList<Double?> = mutableListOf(4.6, null, 9.5)
//    val provasDoSistema : List<Double?> = provas
//
//    fun addNota(nota: Double? = null) = provas.add(nota)
//
//    fun getProvas() : List<Double?> {
//        return provasDoSistema
//    }
//
//    addNota()
//    addNota(7.8)
//
//    println("Insira a nota do aluno")
//    //FORCE UNWRAP = !!
//    //Força a não verificação (isto é, se é nulo ou não)
//    //do retorno da função, no caso, da readLine()
//    val resposta = readLine()?.toDoubleOrNull()
//
//    addNota(resposta)
//    println(getProvas())
//
    //MAP
//    val listaFuncionarios : MutableMap<Int, String> = mutableMapOf(1 to "Ana", 6 to "Priscilla")
//    val funcionarios : Map<Int, String> = listaFuncionarios
//
//    //Tipos de inicialização tardia
//    var credencial: Int = 0
//    var nome : String
//
//    do {
//        println("Insira a credencial")
//        val respostaCredencial = readLine()?.toIntOrNull()
//
//        respostaCredencial?.let {
//            credencial = it
//        }
//
//        println("Insira o nome")
//        nome = readLine().toString()
//
//    } while (respostaCredencial == null && nome.isEmpty())
//
//    listaFuncionarios[credencial] = nome
//
//    println(funcionarios)
//
//    val alunos : List<String> = listOf("André", "André", "André", "André")
//    val aluno : Set<String> = setOf("André", "Andre", "André", "André")
//
//    println("Lista: $alunos")
//    println("Set: " + aluno)
//
//    val voceVaiMeEnxergar = true
//
//    fun teste(){
//        voceVaiMeEnxergar
//
//        fun teste2(): {
//            voceVaiMeEnxergar
//        }
//    }
}



