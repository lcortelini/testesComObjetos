package one.digitalinnovation.collections

//T entra como um nome genérico pra ser instanciado depois
class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]

    //mostra os values do mapa
    fun findAll() = map.values
}