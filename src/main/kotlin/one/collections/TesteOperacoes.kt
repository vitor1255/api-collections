package one.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2000.0,4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("------------------------------")
    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario: ${salarios.minOrNull()}")
    println("Media Salarial: ${salarios.average()}")

    val salariosFiltro25k = salarios.filter { it > 1500.0 }
    println("-------------------")
    salariosFiltro25k.forEach{
        println(it)
    }

    println("---------------------")
    println(salarios.count{it in 2000.0..5000.0})

    println("---------------------")
    println(salarios.find{it == 2000.0})
    println(salarios.find{it == 200.0})

    println("---------------------")
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 10000.0})
}