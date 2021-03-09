package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("------------")
    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média dos salários: ${salarios.average()}")

    println("------------")
    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    salarioMaiorQue2500.forEach {println(it)}

    println("------------")
    println(salarios.count { it in 2000.0..5000.0 }) //devolve número de elementos

    println("------------")
    println(salarios.find { it == 2250.0}) //devolve valor
    println(salarios.find { it == 500.0}) //devolve null

    println("------------")
    println(salarios.any { it == 1000.0}) //devolve true ou false


}