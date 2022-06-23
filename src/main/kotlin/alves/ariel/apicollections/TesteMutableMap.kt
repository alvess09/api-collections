package alves.ariel.apicollections

fun main() {
    //instanciamos os 3 objetos de funcinoarios
    val joao = Funcionario("João", 61500.0,"CLT")
    val tatiane = Funcionario("Tatiane", 10500.0, "CLT")
    val ariel = Funcionario("Ariel", 45500.0, "PJ")

    //instanciamos a classe Repositotio passando Funcionario como T que está na classe possibilitando
    //passar qualaquer objeto que seja do tipo funcionário

    val repositorio =  Repositorio<Funcionario>()
    // repositório pode chamar create() por conta da implementação de Repositório passando um funcionario
    // no padrão (id:String, value)
    repositorio.create(joao.nome, joao)
    repositorio.create(ariel.nome, ariel)
    repositorio.create(tatiane.nome, tatiane)

    println("_________>FindByID")
    println(repositorio.findById(tatiane.nome))

    println("_________>FindByAll")
    println(repositorio.findAll().forEach { println(it) })

    println("_________>Remove tatiane")
    println(repositorio.remove(tatiane.nome))
    println(repositorio.findAll().forEach { println(it) })




}