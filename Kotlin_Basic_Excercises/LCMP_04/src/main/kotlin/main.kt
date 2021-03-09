fun main(args: Array<String>) {
    val phrase = "The quick brown fox"

    val toPigLatin = toPigLatin(phrase)
    val toEnglish = toEnglish(toPigLatin)

    println("$toEnglish -> $toPigLatin")
}

fun toPigLatin(phrase: String): String {
    val lowered = phrase.toLowerCase()
    val translation = lowered.split(" ").map {
        val first = it.take(1)
        val word = it.substring(1..it.lastIndex)

        word + first + "ay"
    }

    return translation.joinToString(" ")
}

fun toEnglish(phrase: String): String {
    val lowered = phrase.toLowerCase()
    val translation = lowered.split(" ").map {
        val word = it.removeSuffix("ay")

        word.last() + word.substring(0 until word.lastIndex)
    }

    return translation.joinToString(" ")
}