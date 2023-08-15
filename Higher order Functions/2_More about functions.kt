fun main() {
  //regular function
  val func1: (Int,Int)->Int  // this function can take 2 integer values as its parameter and would also return an integer value. I
  val func2: (Int,Int)->Boolean
    
  //minimal signature : minimum part essential for a function to have
  val func:() -> Unit
    
  // nullable function type
  val func3: ((String)->Int)? // this function can also store a null
  
  func1 = ::addition //assigned a function addition to func1 using ::
  func2 = {x: Int, y: Int -> x>y}  //lambda function
  func3 = fun(s:String) : Int{return s.length}   //anonymous function (these functions doesn't have names)
  
  func1.invoke(2,4) //invoke using invoke functions or without using it :)
  func2(6,5)
  func3("Utkarsh")
}

fun addition(x:Int, y:Int):Int
{
    return x+y
}
