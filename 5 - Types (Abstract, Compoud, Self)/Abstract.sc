trait Buffer {
  type T
  val element: T
}

abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]
  def length = element.length
}

abstract class IntSeqBuffer extends SeqBuffer {
  type U = Int
}

abstract class StringSeqBuffer extends SeqBuffer

def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer =
  new IntSeqBuffer {
    type T = List[U]
    val element = List(elem1, elem2)
  }

def newStringBuf(str1: String, str2: String): StringSeqBuffer =
  new StringSeqBuffer {
    type U = String
    type T = List[String]
    val element = List(str1, str2)
  }

val buf = newIntSeqBuf(7, 8)
println("length = " + buf.length)
println("content = " + buf.element)

val strBuf = newStringBuf("a", "b")
println("length = " + strBuf.length)
println("content = " + strBuf.element)