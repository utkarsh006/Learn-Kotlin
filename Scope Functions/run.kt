data class Person(var name: String, var age: Int, var city: String) 
{
    fun moveTo(newCity: String) { city = newCity }
    fun incrementAge() { age++ }
}

fun main() 
{
    Person("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }

}

/* OUTPUT
Person(name=Alice, age=20, city=Amsterdam)
Person(name=Alice, age=21, city=London)
 */