object PascalsTriangle {

    fun computeTriangle(rows: Int): List<List<Int>> {
        if(rows < 0) throw IllegalArgumentException("Rows can't be negative!")
        val result = ArrayList<ArrayList<Int>>()
        val start = ArrayList<Int>()
        start.add(1)
        var count = 1
        if(rows > 0) result.add(start)
        for(row in 1 until rows){
            val layer = ArrayList<Int>()
            layer.add(1)
            for(col in 1 until count){
                layer.add(fact(row) / (fact(col) * fact(row - col)))
            }
            count++
            layer.add(1)
            result.add(layer)
        }
        return result
    }

    private fun fact(x: Int): Int{
        var total = 1
        for(i in 1..x){
            total *= i
        }
        return total
    }
}