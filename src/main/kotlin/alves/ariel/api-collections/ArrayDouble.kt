package alves.ariel.`api-collections`

fun main() {
    val values = DoubleArray(2)
    values[0] = 2.00
    values[1] = 1.00
    values.sort()
    values.forEach { println(it) }

    println("------------------------------------->")
    println("IMPRIMINDO ARRAY DOUBLE  FOREACH INDEXADO")

    val values2 = doubleArrayOf(2.00, 3.00,4.00)
    values2.forEachIndexed { index, value -> values2[index] = value * 1.1}
    values2.forEach { println(it) }







}