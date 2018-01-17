object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val wordCount = HashMap<String, Int>()
        val words = phrase.split(" ", ",")
        val invalid = setOf('!', '&', '@', '\\', '$', '%', '^' , '&', ':', '.', '\n')
        for (word in words) {
            var word = word.toLowerCase()
            word = word.filter { it !in invalid }
            when{
                word.startsWith("\'") && word.endsWith("\'") -> wordCount.put(word.substring(1, word.length - 1),
                        wordCount.getOrDefault(word.substring(1, word.length - 1), 0) + 1)
                word.isNotEmpty() -> wordCount.put(word, wordCount.getOrDefault(word, 0) + 1)
            }
        }
        return wordCount
    }

}