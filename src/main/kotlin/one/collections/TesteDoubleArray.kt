package one.collections

fun main() {
    val salarios = DoubleArray(5)
        salarios[0] =1000.0
        salarios[1] =1200.0
        salarios[2] =1400.0
        salarios[3] =1600.0
        salarios[4] =1800.0
    println("-----------------")

    salarios.forEach {
        println(it)
    }
    println("------Aumento de 10%-----------\n")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }


    salarios.forEach { println(it) }
    println("-----------------\n")

    val salarios2 = doubleArrayOf(1000.0,1200.0,1400.0,1600.0,1800.0)
    salarios2.sort()
    salarios2.forEach {
        println(it)
    }
    println("-----------------\n")



}