object ByNameParameters {
  //TODO
  //Create a method whileLoop(condition)(body)
  // If the condition is true, the body is executed and then a recursive call to whileLoop is made.

  def main(args: Array[String]): Unit = {
    whileLoop (i > 0) {
      println(i)
      i -= 1
    }  // prints 2 1
  }
}
