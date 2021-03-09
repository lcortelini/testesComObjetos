package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome = "João", salario = 2000.0, contrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, contrato = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 6000.0, contrato = "PJ")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it) }

    println(funcionarios.find {it.nome == "Maria"})

    println("-------------")
    funcionarios
            .sortedBy { it.salario }
            .forEach {println(it)}

    println("-------------")
    funcionarios
            .groupBy {it.contrato}
            .forEach{println(it)}
}

