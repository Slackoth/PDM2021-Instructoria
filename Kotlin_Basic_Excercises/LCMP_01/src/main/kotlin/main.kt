fun main(args: Array<String>) {
    val needle = "ABBABBA"
    val haystack = "ABBABBAQEWRWEABBABBABBAQOIUEXCABBABBA"

    findNeedleInHaystack(needle, haystack)
}

fun findNeedleInHaystack(needle: String, haystack: String) {
    val needleSize = needle.length
    val haystackSize = haystack.length
    val list: MutableList<Int> = mutableListOf()

    for(i in 0..haystackSize - needleSize) {
        val word = haystack.substring(i, i + needleSize)

        if(word.equals(needle, true))
            list.add(i)
    }

    print("Positions: ${list.joinToString(", ")}")
}
