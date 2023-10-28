fun main() {
    println("Введите массив слов, разделяя их запятой:")
    val wI = readLine()?.split(",")
    wI?.let { words ->
        val groups = groupW(words)
        print(groups)
    }
}
fun groupW(words: List<String>): List<List<String>> {
    val groups = mutableListOf<MutableList<String>>()
    words.forEach { word ->
        val group = groups.find { it[0].isAOf(word) }
        if (group != null) {
            group.add(word)
        } else {
            groups.add(mutableListOf(word))
        }
    }
    return groups
}
fun String.isAOf(other: String): Boolean {
    return this.toList().sorted() == other.toList().sorted()
}
fun print(groups: List<List<String>>) {
    groups.forEachIndexed { index, group ->
        println("Группа ${index + 1}")
        group.forEach { word ->
            println(word)
        }
        println()
    }
}