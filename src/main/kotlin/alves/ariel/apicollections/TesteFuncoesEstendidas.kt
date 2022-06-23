package alves.ariel.apicollections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1000".toBigDecimal(),
        "4000".toBigDecimal()

    )

    println("Somatoria de salarios: ${salarios.somatoria()}")


    println("Média de salarios: ${salarios.media()}")


}