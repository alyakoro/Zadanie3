fun main () {
    val v1 = charArrayOf('П','О','Л','Е')
    val v2 = charArrayOf('С','О','О','Б','Щ','Е','Н','И','Е')
    val num = mapOf(
        'А' to 21, 'Б' to 13, 'В' to 4, 'Г' to 20, 'Д' to 22, 'Е' to 1, 'Ё' to
                25, 'Ж' to 12,
        'З' to 24, 'И' to 14, 'Й' to 2, 'К' to 28, 'Л' to 9,'М' to 23, 'Н'
                to 3, 'О' to 29,
        'П' to 6, 'Р' to 16, 'С' to 15, 'Т' to 11, 'У' to 26, 'Ф' to 5,
        'Х' to 30, 'Ц' to 27,
        'Ч' to 8, 'Ш' to 18, 'Щ' to 10, 'Ь' to 33, 'Ъ' to 32, 'Э' to
                19,'Ю' to 7,'Я' to 17,'Ы' to 31
    )
    var i = 0
    var l = 0
    val v22 = v2.size
    val v11 = v1.size
    var com = "".toString()
    for (vowel in v2){
        var j = v2[i]
        i++
        if (l > v11-1){
            l = 0
        }
        var k = v1[l]
        l++
        var itog1 = num[j]
        var itog2 = num[k]
        var itog = itog1!! + itog2!!
        if (itog > 33)
            itog = itog-33
        com = com + (num.filter { it.value == itog }).toString()
    }
    println(num.keys)
    println(num.values)
    println("Ключевое слово - " + v1.contentToString())
    println("Исходный текст - " + v2.contentToString())
    println("Зашифрованный текст - " + com)
}