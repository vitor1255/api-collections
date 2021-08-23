package one.collections

fun main() {
    val values = IntArray(6)

    values[0] = 1
    values[1] = 7
    values[2] = 4
    values[3] = 8
    values[4] = 9
    values[5] = 10
    println("------------------------------------")
    for(valor in values) {
        print(valor)
    }
    println("\n Pula linha a cada valor\n")
    values.forEach {
        println(it)
    }
    println("\nImprime o INDEX\n")
    for (index in values.indices) {
        println(values[index])
    }
    println("\n Menor para o maior \n")
    values.sort()
    for(valor in values) {
        println(valor)
    }



}