object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int{
        var multiples = HashSet<Int>()
        for(item in factors){
            var number = item
            while(number < limit){
                multiples.add(number)
                number += item
            }
        }
        return multiples.sum()
    }
}