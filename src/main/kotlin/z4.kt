fun main() {
    print("Введите первый числовой массив: ")
    val a = readLine().toString()
    val b = a.toCharArray()
    print("Введите второй числовой массив: ")
    val aa = readLine().toString()
    val bb = aa.toCharArray()
    var numbers = ""
    val arraySizebb = bb.size
    val arraySizeb = b.size
    var i = 0
    var j = 0
    while (j != arraySizebb) {
        if (b[i] != bb[j]){
            i++
            if (i == arraySizeb){
                j++
                i=0
            }
        }
        else{
            numbers += b[i]
            j++
            b[i] = ' '
            i = 0
        }
    }
    println(numbers)
}