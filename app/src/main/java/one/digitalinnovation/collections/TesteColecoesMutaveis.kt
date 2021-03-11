package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome = "João", salario = 2000.0, contrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, contrato = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 6000.0, contrato = "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("-------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("---------SET---------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("-------------------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("-------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}