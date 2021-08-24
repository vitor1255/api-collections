package one.collections

fun main() {
    val Vitor = Funcionario("Vitor",1000.0, "CLT")
    val Henrique = Funcionario("Henrique",2000.0,"CLT")
    val Mariano = Funcionario("Mariano",3000.0,"PJ")

    val funcionario1 = setOf(Vitor,Henrique)
    val funcionario2 = setOf(Mariano)

    val resultunion = funcionario1.union(funcionario2)
    resultunion.forEach{
        println(it)}

    println("------------------------------")
    val funcionario3 = setOf(Vitor, Henrique,Mariano)
    val resultsub = funcionario3.subtract(funcionario2)
    resultsub.forEach{
        println(it)
    }
    println("------------------------------")
    val resultint = funcionario3.intersect(funcionario2)
    resultint.forEach{
        println(it)
    }
}