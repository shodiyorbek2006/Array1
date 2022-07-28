import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var array = arrayOf(11,22,33,44,55)
    val arrayOdd = IntArray(100)
    var count = 0
    var c = 0

    for (arr in array.indices){
        println(" "+array[arr])
        if (array[arr]%11==0){
            arrayOdd[count] = array[arr]
            count++
            c++
        }
    }
    println()
    var r = 0
    for (element in 0 until count){
        r+=arrayOdd[element]
        println(arrayOdd[element])
    }
    println()
    println(r)
    println(c)
}