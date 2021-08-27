package one.collections

fun main() {
    val Vitor = Funcionario("Vitor",1000.0, "CLT")
    val Henrique = Funcionario("Henrique",2000.0,"CLT")
    val Mariano = Funcionario("Mariano",3000.0,"PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Vitor.nome, Vitor)
    repositorio.create(Henrique.nome, Henrique)
    repositorio.create(Mariano.nome, Mariano)

    println(repositorio.findById(Vitor.nome))

    println("-------------------------")
    repositorio.findAll().forEach{ println(it)}

}