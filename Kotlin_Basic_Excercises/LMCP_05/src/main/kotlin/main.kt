fun main() {
    for(i in 0..10)
        println(fibonacci(i, 0, 1))
}

fun fibonacci(position: Int, prev: Int, current: Int): Int {
    return if(position == 0)
        prev
    else fibonacci(position - 1, current, current + prev)
}