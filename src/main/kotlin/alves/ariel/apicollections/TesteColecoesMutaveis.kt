package alves.ariel.apicollections

fun main() {
    val joao = Funcionario("João", 61500.0,"CLT")
    val tatiane = Funcionario("Tatiane", 10500.0, "CLT")
    val ariel = Funcionario("Ariel", 45500.0, "PJ")


    //Mutable Lists são listas que podemos alterar
    //consegumimos manipular com .add .remove e as demais
    // manipulações de listas

    val funcionarios =  mutableListOf(joao, tatiane)
    funcionarios.forEach { println(it) }

    println("____________> Mutable print")
    funcionarios.add(ariel)
    funcionarios.forEach { println(it) }

    println("____________> Mutable print")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }




}