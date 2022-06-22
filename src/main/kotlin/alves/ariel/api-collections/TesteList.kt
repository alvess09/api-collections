package alves.ariel.`api-collections`

fun main() {
    val joao = Funcionario("João", 61500.0)
    val tatiane = Funcionario("Tatiane", 10500.0)
    val ariel = Funcionario("Ariel", 45500.0)
    val funcionarios = listOf(joao,tatiane,ariel)
    println("------------------------>")
    funcionarios.forEach { println(it) }
    println("------------------------>")
    println("Encontrando Tatiane com .find()")
    println(funcionarios.find { it.nome == "Tatiane" })

    println("------------------------>")
    println("Encontrando por filtro /valor com sortedBy()")
    funcionarios
     //ordena por salario de forma crescente
        .sortedBy { it.salario }
     // imprime funcionarios já ordenados
        .forEach { println(it) }




}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String = """
        Nome: $nome,
        Salário: $salario
    """.trimIndent()
}