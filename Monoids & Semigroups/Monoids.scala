// 1: Define an abstract class Monoid[A] with combine(x,y) and empty methods

object Monoids {
  // 2: Create a SumIntMonoid
  // implicit val sumIntMonoid: Monoid[Int] = new Monoid[Int]

  // 3: Create a StringMonoid

  // 4: Create a BooleanMonoid with 'or' operation and true as empty

  def sum[A](list: List[A])(implicit m: Monoid[A]): A =
    if (list.isEmpty) m.empty
    else m.combine(list.head, sum(list.tail))

  def main(args: Array[String]): Unit = {

    println(sum(List(4, 5)))
    //println(sum(List("a", "b", "c")))
    //println(sum(List(true, false)))
    //println(sum[String](List()))
  }
}
