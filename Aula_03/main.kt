fun main() {
//    Aula 03 - HERANÇA
//     Quando eu devo utilizar herança?
//     Ao abstrair coisas do mundo real, eu perceber que:
//     Posso agrupar características e comportamentos
//     Por exemplo todo médico, paciente e enfermeiro tem nome, cpf e data nascimento e fala

    val paciente = Paciente(nomePaciente = "Gabriela",
        cpfPaciente = "xpto",
        dataNascimentoPaciente = "xpto",
        convenioMedico = "xpto")

    println(paciente)
    println(paciente.falar())

    val medico = Medico(nomeMedico = "Bruna",
    cpfMedico = "abcd",
    dataNascimentoMedico = "abcd",
    crm = "abc1030")

    val func = Gerente(nomeGerente = "Jessica", salarioGerente = 10000.00, "jessica123")
    println(retornarFuncionario(func))

}