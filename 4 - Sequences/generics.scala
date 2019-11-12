sealed trait IntList {
    def fold(end: Int, f: (Int, Int) => Int): Int =
        this match {
            case End => end
            case Pair(hd, tl) => f(hd, tl.fold(end, f))
    }

    def length: Int = fold(0, (_, tailLength) => 1 + tailLength)

    def product: Int = fold (1, (head, tail) => head*tail)
     
    def sum: Int = fold(0, (head, tail) => head + tail)
}
case object End extends IntList

final case class Pair(head: Int, tail: IntList) extends IntList

object Main{
    def main(arg:Array[String]):Unit = {
        val example = Pair(1, Pair(2, Pair(3, End)))
        assert(example.length == 3)
        assert(example.product == 6)
        assert(example.sum == 6)
        // assert(example.tail.product == 6)
        // assert(End.product == 1)

        // println(example.double)
        // assert(example.double == Pair(2, Pair(4, Pair(6, End))))
        // assert(example.tail.double == Pair(4, Pair(6, End)))
        // assert(End.double == End)
    }
}




