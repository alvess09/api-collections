package alves.ariel.apicollections


//o <T> é considerado como generics  ele será substituido por um objeto

class Repositorio <T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T){
           map[id] = value
    }
    fun remove(id: String) = map.remove(id)
    fun findById(id: String) = map[id]

    fun findAll() = map.values


}