package one.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Vitor", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k,v) -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf(
        "Henrique" to 2000.0,
        "Mariano"  to 4000.0
    )

    map2.forEach{ (k,v) -> println("Chave: $k - Valor: $v")}

}