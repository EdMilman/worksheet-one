object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        var remainder = int
        val factors = mutableListOf<Int>()
        var divisor = 2
        while(remainder > 1){
            while(remainder % divisor == 0 ){
                factors.add(divisor)
                remainder /= divisor
            }
            divisor++
        }
        return factors
    }

    fun primeFactors(long: Long): List<Long> {
        var remainder = long
        val factors = mutableListOf<Long>()
        var divisor = 2
        while(remainder > 1){
            while((remainder % divisor).toInt() == 0 ){
                factors.add(divisor.toLong())
                remainder /= divisor
            }
            divisor++
        }
        return factors
    }
}
