package alves.ariel.`api-collections`

fun main() {
    //podemos usar o array de Inteiro definindo um tamanho específico dessa  forma é
    // necessário inicializar as posições

    val values = IntArray(5)
    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    for (valor in values) {
        println(valor)
    }

    println("------------------------------------>")

    //podemos usar o array de Inteiro colocando um tamanho dinamico já inicializados
    val valuesDinamicos = intArrayOf(2,3,4)

    for (valor in valuesDinamicos) {
        println(valor)
    }

    //podemos usar o array de String definindo um tamanho específico dessa  forma é
    // necessário inicializar as posições
    println("------------------------------------>")
    println("IMPRIME AS STRINGS")

    val nomes = Array<String>(5){""}
    nomes[0] = "zé-1"
    nomes[1] = "zé-2"
    nomes[2] = "zé-3"
    nomes[3] = "zé-4"
    nomes[4] = "zé-5"

    println("------------------------------------>")
    for(nome in nomes) {
        println(nome)
    }
    println("------------------------------------>")

    //a função sort() organiza de forma crescente , ordem alfabética etc
    nomes.sort()
    // quandon iteramos dessa forma (lambda functions) a variável é representada pelo it
    nomes.forEach { it -> println(it)}
    println("------------------------------------>")

    //podemos usar o array de String colocando um tamanho dinamico quando inicializamos
    //as posições

    val nomes2 = arrayOf("zé","joão", "etc")







}