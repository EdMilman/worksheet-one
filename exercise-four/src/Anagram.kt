class Anagram(private val word: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        val current =  HashMap<Char, Int>()
        val compare = HashMap<Char, Int>()
        val result = ArrayList<String>()
        for(item in anagrams){
            if(item.length == word.length && word.toLowerCase() != item.toLowerCase()){
                result.add(item)
            }
        }
        for(letter in word){
            current.put(letter.toLowerCase(), current.getOrDefault(letter, 0) + 1)
        }
        for(item in anagrams){
            for(letter in item){
                compare.put(letter.toLowerCase(), compare.getOrDefault(letter, 0) + 1)
            }
            for(key in current.keys){
                if(compare[key] != current[key]){
                    result.remove(item)
                }
            }
            compare.clear()
        }
        return HashSet<String>(result)
    }
}