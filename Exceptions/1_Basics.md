- Errors which we can handle and show appropriate message to the users is called exception handling.
Ex : If a user enters string value in the age field we can show a valid message.

- Function calls works in stack form.

- During exception, an object of class exception is thrown.

- We can have our own custom classes for Exceptions.

## An example of Exception

```
fun getName(name : String){
    if(name.length<4){
        throw Exception("Name is short")
    }
    
    println(name)
}
fun main() {
   getName("Utk")
}

```
