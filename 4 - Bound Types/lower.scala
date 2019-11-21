// Scala Program To Demonstrate Scala Lower Bound 
class Principal 
class Teacher extends Principal 
class Student extends Teacher
  
class School 
{ 
    // Declaration of lower bound 
    def display [T >: Teacher](t: T) 
    { 
        println(t) 
    } 
} 
  
// Object created 
object ScalaUpperBounds 
{ 
    // Driver code 
    def main(args: Array[String]) 
    { 
        // Defined new variable 
        val principal = new Principal 
        val teacher = new Teacher 
        val student = new Student
  
        val school = new School 
          
        school.display(principal) 
        school.display(teacher) 
        school.display(student)
    } 
}
