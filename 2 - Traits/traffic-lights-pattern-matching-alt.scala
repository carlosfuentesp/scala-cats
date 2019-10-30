sealed trait TrafficLight 
case object Red extends TrafficLight
case object Green extends TrafficLight
case object Yellow extends TrafficLight

object Main{
    def main(arg:Array[String]):Unit = {
        println(next(next(Red)))
    }

    def next(status: TrafficLight): TrafficLight = status match {
        case Red => Green
        case Green => Yellow
        case Yellow => Red
    }
}