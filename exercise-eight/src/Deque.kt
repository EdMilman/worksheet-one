class Deque<T> {
    private var head: Element<T>? = null

    fun push(value: T) {
        var new = Element(value, next = head)
        head?.prev = new
        head = new
    }

    fun pop(): T? {
        var result = head
        head = head?.next
        head?.prev = null
        result?.next = null
        return result?.value
    }

    fun unshift(value: T) {
        when{
            head != null -> {
                var tail = head
                while (tail?.next != null) {
                    tail = tail?.next
                }
                var new = Element(value, prev = tail)
                tail?.next = new
            }
            else -> head = Element(value)
        }
    }

    fun shift(): T? {
        var tail = head
        while (tail?.next != null) {
            tail = tail?.next
        }
        val before = tail?.prev
        before?.next = null
        tail?.prev = null
        return tail?.value
    }

    private data class Element<T>(val value: T, var prev: Element<T>? = null, var next: Element<T>? = null)
}