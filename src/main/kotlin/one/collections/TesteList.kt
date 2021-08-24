package one.collections

fun main() {
    val Vitor = Funcionario("Vitor",1000.0, "CLT")
    val Henrique = Funcionario("Henrique",2000.0,"CLT")
    val Mariano = Funcionario("Mariano",3000.0,"PJ")

    val funcionarios = listOf(Vitor, Henrique, Mariano)

    funcionarios.forEach {
        println(it)}
println("-------------------------------------------")
    println(funcionarios.find { it.nome == "Mariano" })

    println("----------------------")
    funcionarios
        .groupBy {  it.Contrato }
        .forEach{ println(it)}
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val Contrato: String
) {
    override fun toString(): String =
        """
            nome: $nome
            salario: $salario
           """.trimIndent()
}