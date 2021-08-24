package one.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val Contrato: String
) {
    override fun toString(): String =
        """
            nome: $nome
            salario: $salario
           """.trimIndent()}