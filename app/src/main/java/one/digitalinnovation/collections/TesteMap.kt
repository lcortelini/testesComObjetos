package one.digitalinnovation.collections

fun main() {
    //PAIR recebe mais de um tipo de dado
    val pair : Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ (key, value) -> println("Chave: ${key} - Valor:${value}")}

    //infix function
    val map2 = mapOf(
            "Pedro" to 2500.0,
            "Maria" to 3000.0
    )

    map2.forEach{ (k, v) -> println("Chave: ${k} - Valor:${v}")}
}