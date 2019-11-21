// Scala program to illustrate how to  
// create an object inside a class, Or 
// a class inside an object 
  
// Class inside Object 
class outer_class[T]
{ 
    object inner_object 
    { 
        val q = 0; 
        def method(t: T) 
        { 
            for(q <- 0 to 2) 
            { 
                println(s"object inside a class example: $t") 
            } 
            println() 
        } 
    } 
} 
  
// Object inside Class 
object outer_object 
{ 
    class inner_class 
    { 
        val s = 0; 
        def method() 
        { 
            for(s <- 0 to 2) 
            { 
                println("class inside an object example") 
            } 
        } 
    } 
}

object Main 
{ 
      
    // Main method 
    def main(args: Array[String]) 
    { 
          
        // Object inside a class 
        new outer_class[String]().inner_object.method("hola"); 
          
        // Class inside an object 
        new outer_object.inner_class().method; 
    } 
} 