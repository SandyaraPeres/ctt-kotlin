data class Paciente(
    val nomePaciente: String,
    val cpfPaciente: String,
    val dataNascimentoPaciente : String,
    val convenioMedico: String) : Pessoa(
    nome = nomePaciente,
    cpf = cpfPaciente,
    dataNascimento = dataNascimentoPaciente)
