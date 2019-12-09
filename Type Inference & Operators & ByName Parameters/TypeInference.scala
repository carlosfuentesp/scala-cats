object TypeInference {
  //Recursive methods
  def factorial(n: Int):Int = if (n == 0) 1 else n * factorial(n - 1)

  def main(args: Array[String]) {
    //Omitting the type
    //val variable_name : Scala_data_type = value
    println("Scala Data Types")
    val number: Int = 5;
    val big_number = 100000000L
    val small_number: Int = 1
    val double_number: Double = 2.50
    val float_number: Float = 2.50f
    val string_of_characters: String = "This is a string of characters"
    val byte = 0xc
    val character: Character = 'D'
    val empty: Unit = ()

    //Anonymous function parameter
    Seq(1, 3, 4).map((x:Int) => x * 2)

    println(number)
    println(big_number)
    println(big_number.getClass)
    println(small_number)
    println(double_number)
    println(float_number)
    println(string_of_characters)
    println(byte)
    println(byte.getClass)
    println(character)
    println(empty)
  }
}
