package one.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Vitor"
    nomes[1] = "Henrique"
    nomes[2] = "Mariano"

    for (nome in nomes) {
        println(nome)
    }

    println("------------------")
    nomes.sort()
    nomes.forEach {
        println(it) }

    val nomes2 = arrayOf("Carvalho", "Izabelli", "Garbelini")
    println("----------------")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}