//  "with this object, do the following."

fun main() {

    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }

}

/* OUTPUT
'with' is called with argument [one, two, three]
It contains 3 elements   */

fun main() {

    val numbers = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbers) {
        "The first element is ${first()}," +
        " the last element is ${last()}"
    }
    println(firstAndLast)

}

/* OUTPUT 
The first element is one, the last element is three   */