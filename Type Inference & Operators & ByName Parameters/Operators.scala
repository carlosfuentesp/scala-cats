object Operators {
  //Any legal identifier as an operator

  //TODO
  //Create a class Vec with a method + which we'll use to add vector1 and vector2

  case class Vec(value: Int) {
    def +(otherVector:Vec):Vec = Vec(value + otherVector.value)
  }

  case class MyBool(x: Boolean) {
    def and(that: MyBool): MyBool = if (x) that else this
    def or(that: MyBool): MyBool = if (x) this else that
    def negate: MyBool = MyBool(!x)
    //TODO
    //Create not(MyBool) and
    def not = MyBool(x).negate
    // Create xor / Exclusive OR (MyBool, MyBool) = (x or y) and not(x and y)
    def xor(other: MyBool) = (this or other) and (this and other).not
    }

  def main(args: Array[String]): Unit = {
    val result = Vec(5) + Vec(9)
    println(result)
    println(MyBool(true).not)
    println(MyBool(true).xor(MyBool(true)))
//    val vector3 = vector1 + vector2
//    vector3.x // 3.0
//    vector3.y // 3.0
  }
}
