package alves.ariel.apicollections

fun main() {
    val joao = Funcionario("João", 61500.0,"CLT")
    val tatiane = Funcionario("Tatiane", 10500.0, "CLT")
    val ariel = Funcionario("Ariel", 45500.0, "PJ")

   //setof é conjunto  de funcionarios

    val funcionarios1 = setOf(ariel, joao)
    val funcionarios2 = setOf(tatiane)

    //juntando os dois conjuntos com .union

    println("UNION")
    val resultado = funcionarios1.union(funcionarios2)
    resultado.forEach { println(it) }

    println("------------->")
    println("SUBSTRACT")
    val funcionarios3 = setOf(ariel, joao, tatiane)
    val subtracaoGrupo = funcionarios3.subtract(funcionarios2)
    subtracaoGrupo.forEach { println(it) }

    println("--------------->")
    println("INTERSECT")
    //imprime o que é comum entre os 2 conjuntos
    val intersectGroup = funcionarios3.intersect(funcionarios2)
    intersectGroup.forEach { println(it) }



}