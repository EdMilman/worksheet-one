object Accumulate {
    fun <T, R> accumulate(collection: List<T>, function: (T) -> R): List<R> {
        val result = ArrayList<R>()
        collection.forEach{result.add(function(it))}
        return result
    }
}