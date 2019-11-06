sealed trait IntList {
    def length: Int = {
        this match {
            case End => 0
            case Pair(_, tail) => 1 + tail.length
        }
    }

    def product: Int = {
        this match {
            case End => 1
            case Pair(head, tail) => head * tail.product
        }
    }

    def double: IntList = {
        this match {
            case End => End
            case Pair(head, tail) => Pair(head*2, tail.double)
        }
    }
}
case object End extends IntList

final case class Pair(head: Int, tail: IntList) extends IntList

object Main{
    def main(arg:Array[String]):Unit = {
        val example = Pair(1, Pair(2, Pair(3, End)))
        println(example.length)
        assert(example.length == 3)
        assert(example.tail.length == 2)
        assert(End.length == 0)    

        println(example.product)
        assert(example.product == 6)
        assert(example.tail.product == 6)
        assert(End.product == 1)

        println(example.double)
        assert(example.double == Pair(2, Pair(4, Pair(6, End))))
        assert(example.tail.double == Pair(4, Pair(6, End)))
        assert(End.double == End)
    }
}




