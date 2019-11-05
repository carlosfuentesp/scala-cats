import scala.collection.immutable.Seq

val sequence= Seq(1,2,3,4,8,9)

sequence.tail.tail.head

val sort = sequence.sortWith(_ < _)

sequence.:+(0)

sequence :+(0)

sequence.+:(0)

0 +: sequence

List(11,12,13) ++ sequence

Seq(11,12,13) ++ sequence

//sequence = sequence ++ sequence

