// "apply the following assignments to the object"

data class Person(
    var name: String, 
    var age: Int = 0, 
    var city: String = ""
)

fun main() {

    val praani = Person("Utkarsh").apply {
        age = 50
        city = "Delhi"        
    }
    println(praani)

}

// OUTPUT : Person(name=Utkarsh, age=50, city=Delhi)