fun getName(name : String):Int{
    return name.toInt()
}

fun main() {
    
    val name = "ut"
    try{
       val temp = getName(name)
       println(temp)
    }  catch(e:Exception){
        println("Don't give a string value")
       }  finally{
        println("Finally block always runs")
       }
    
}
