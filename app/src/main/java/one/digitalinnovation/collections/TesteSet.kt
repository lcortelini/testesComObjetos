package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome = "João", salario = 2000.0, contrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, contrato = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 6000.0, contrato = "PJ")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    //une os conjuntos
    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach { println(it) }

    println("--------------------")
    val funcionarios3 = setOf(joao, pedro, maria)

    //subtract retira o que tem no grupo sugerido como parâmetro
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{println(it)}

    println("--------------------")

    //intersect retira o item que não se repete
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}