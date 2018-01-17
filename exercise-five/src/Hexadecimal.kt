import java.lang.Math.pow

object Hexadecimal {

    fun toDecimal(s: String): Int {
        var total = 0
        val end = s.length - 1
        val low = s.toLowerCase()
        for(i in 0..end){
            when(low[i]){
                in '0'..'9' -> total += ((low[i].toInt() - 48) * (pow(16.0, end - i.toDouble()))).toInt()
                in 'a'..'f' -> total += ((low[i].toInt() - 87) * (pow(16.0, end - i.toDouble()))).toInt()
                else -> return 0
            }
        }
        return total
    }
}