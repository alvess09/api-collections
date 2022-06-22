package alves.ariel.apicollections

fun main() {
    val joao = Funcionario("João", 61500.0,"CLT")
    val tatiane = Funcionario("Tatiane", 10500.0, "CLT")
    val ariel = Funcionario("Ariel", 45500.0, "PJ")




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

    println("------------------------>")
    println("Encontrando por filtro /valor com groupBy()")
    funcionarios
        //agrupa por tipo de forma crescente
        .groupBy { it.tipoContratacao }
        // imprime funcionarios já ordenados
        .forEach { println(it) }

}

