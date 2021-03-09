fun main(args: Array<String>) {
    val numbers = arrayOf(1,2,3,4,5)
    val rotations = 2

    rotateIntArray(numbers, rotations)
}

fun rotateIntArray(array: Array<Int>, rotations: Int) {
    for(i in 1..rotations)
        rotateByOne(array)

    array.forEach {
        println(it)
    }
}

fun rotateByOne(array: Array<Int>) {
    for(i in 0 until array.lastIndex)
        array.swap(i, i + 1)
}

fun <T> Array<T>.swap(index1: Int, index2: Int) {
    val aux = this[index1]
    this[index1] = this[index2]
    this[index2] = aux
}