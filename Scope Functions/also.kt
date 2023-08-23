// "and also do the following with the object"

fun main() {

    val numbers = mutableListOf("one", "two", "three")
    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")

}

// OUTPUT : The list elements before adding new one: [one, two, three]