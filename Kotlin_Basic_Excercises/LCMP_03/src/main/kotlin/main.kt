fun main(args: Array<String>) {
    val array = arrayOf(1,2,3,4,5,6,7,8,9,10)

    perfectSquares(array)
}

fun perfectSquares(array: Array<Int>) {
    val list = array.map { it * it }
    print("Perfect squares: "); list.forEach { println(it) }
}