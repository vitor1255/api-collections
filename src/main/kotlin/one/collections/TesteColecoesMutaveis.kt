package one.collections

fun main() {
    val Vitor = Funcionario("Vitor", 1000.0, "CLT")
    val Henrique = Funcionario("Henrique", 2000.0, "CLT")
    val Mariano = Funcionario("Mariano", 3000.0, "PJ")

    println("------------LIST--------------")
val funcionarios = mutableListOf(Vitor,Mariano)
    funcionarios.forEach { println(it) }

    println("------------ADD--------------")

    funcionarios.add(Henrique)
    funcionarios.forEach { println(it) }

    println("----------REMOVE----------------")

    funcionarios.remove(Mariano)
    funcionarios.forEach { println(it) }

    println("----------SET----------------")

    val funcionarioSet = mutableListOf(Vitor)
    //funcionarioSet.forEach { println(it) }


    funcionarioSet.add(Henrique)
    funcionarioSet.add(Mariano)
    funcionarioSet.forEach { println(it) }

    println("----------SET----------------")

    funcionarioSet.remove(Mariano)
    funcionarioSet.forEach { println(it) }


}