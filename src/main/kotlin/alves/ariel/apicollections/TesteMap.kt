package alves.ariel.apicollections

fun main() {
    //aqui usamos o objeto Pair para criar um modelo de par recebendo uma string seguido de um double
    val pair: Pair<String, Double> = Pair("Alves", 1000.0)
    //aqui estamos mapeando o valor de pair
    val map1 = mapOf(pair)
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v")  }

    //essa segunda forma de usar o map é chamada de INFIX
    val map2 = mapOf("pedro" to 205.00, "maria" to 100.0)
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")  }

}