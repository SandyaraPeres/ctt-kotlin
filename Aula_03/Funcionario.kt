// Não existe uma """boa prática""", uma regra para implementação
// E sim o bom senso: caso exista classes com diversos métodos,
// regras de negócio complexas, diversos atributos, cogite em separá-los e nao
// colocá-los em uma sealed class
sealed class Funcionario(val nome: String, val salario : Double)

class Gerente(nomeGerente: String,
              salarioGerente: Double,
              val senha: String) : Funcionario(
    nome = nomeGerente,
    salario = salarioGerente)

class Vendedor(nomeVendedor: String,
               salarioVendedor: Double,
               val comissao: String) : Funcionario(
    nome = nomeVendedor,
    salario = salarioVendedor)

fun retornarFuncionario(funcionario : Funcionario) : String {
    return when(funcionario) {
        is Gerente -> "Esse cara é um gerente, sua senha: ${funcionario.senha}"
        is Vendedor -> "Esse cara é um vendedor, sua comissão: ${funcionario.comissao}"
    }
}


