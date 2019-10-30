sealed trait TrafficLight {
    def next: TrafficLight = 
        this match {
            case Red => Green
            case Yellow => Red
            case Green => Yellow
        }
}
case object Red extends TrafficLight
case object Green extends TrafficLight
case object Yellow extends TrafficLight

object Main{
    def main(arg:Array[String]):Unit = {
        println(Red.next.next)
        println(Yellow.next)
        println(Green.next)
    }

}