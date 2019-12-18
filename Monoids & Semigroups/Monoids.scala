// 1: Define an abstract class Monoid[A] with combine(x,y) and empty methods
trait Monoid[A] {
  def combine(a: A, b: A): A
  def empty: A
}

object Monoids {
  // 2: Create a SumIntMonoid

  implicit val sumIntMonoid = new Monoid[Int] {
    def combine(a: Int, b: Int): Int = a + b
    def empty = 0
  }

  // 3: Create a StringMonoid
  implicit val stringMonoid = new Monoid[String] {
    def combine(a: String, b: String): String = s"$a$b"
    def empty = ""
  }

  // 4: Create a BooleanMonoid with 'or' operation and true as empty
  implicit val booleanMonoid = new Monoid[Boolean] {
    def combine(a: Boolean, b: Boolean): Boolean = a || b
    def empty = true
  }

  def combineAll[A](list: List[A])(implicit m: Monoid[A]): A =
    if (list.isEmpty) m.empty
    else m.combine(list.head, combineAll(list.tail))

  def main(args: Array[String]): Unit = {
    println(combineAll(List(4, 5)))
    println(combineAll(List("a", "b", "c")))
    println(combineAll(List(true, false)))
    println(combineAll[String](List()))
  }
}
