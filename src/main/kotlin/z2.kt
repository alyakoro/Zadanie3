fun main() {
    var arr = arrayOf(
        intArrayOf(5, 9, 6, 7, 2),
        intArrayOf(9, 8, 4, 5, 3),
        intArrayOf(6, 4, 3, 8, 7),
        intArrayOf(7, 5, 8, 4, 8),
        intArrayOf(2, 3, 7, 8, 1)
    )
    for (row in arr) {
        println(row.contentToString())
    }
    var i = 0
    var j = 1
    var coun = 0
    var k = 0
    for (row in arr) {
        while (j <= 4) {
            if (arr[i][j] == arr[j][i]) {
                k++
                if (k == 10){
                    println("Является симметричным относительно главной диагонали")
                }
            }
            j++
        }
        coun++
        i++
        j = 1 + coun
    }
}