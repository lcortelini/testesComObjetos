package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome = "João", salario = 2000.0, contrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, contrato = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 6000.0, contrato = "PJ")

    //T genérico foi instanciado como classe Funcionário
    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("---------------------")
    repositorio.findAll().forEach { println(it) }

    println("---------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}