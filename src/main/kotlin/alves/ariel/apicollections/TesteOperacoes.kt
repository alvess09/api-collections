package alves.ariel.apicollections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2000.0, 4000.0)

    for(salario in salarios) {
        println(salario)
    }

    println("-------------------->")

    //qual maior valor de salario?
    println("Maior salário: ${salarios.maxOrNull()}")
    println("-------------------->")

    //qual menor valor de salario?
    println("Menor salário: ${salarios.minOrNull()}")
    println("-------------------->")

    //qual média salarial?
    println("Média salárial: ${salarios.average()}")

    println("-------------------->")

    //filtrando uma expressão sobre o objeto de iteração
    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    salarioMaiorQue2500.forEach { println("Salario maior que 2500: $it")}

    println("-------------------->")
    //qual range salarial?
    println(salarios.count { it in 2000.0..5000.0 })

    println("-------------------->")
    //encontrar valor específico no array salarial
    println(salarios.find { it == 2000.0 })
    println(salarios.find { it == 5000.0 })

    println("-------------------->")
    //encontrar valor qualquer no array salarial .any() retorna boleano
    println(salarios.any { it == 2000.0 })
    println(salarios.any { it == 6000.0 })

    println("-------------------->")





}