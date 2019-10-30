sealed trait TrafficLight {
    def next:TrafficLight
}

case object Red extends TrafficLight {
    def next: TrafficLight = Green
}
case object Green extends TrafficLight {
    def next: TrafficLight = Yellow
}
case object Yellow extends TrafficLight {
    def next: TrafficLight = Red
}

object Main{
    def main(arg:Array[String]):Unit = {
        println(Red.next.next)
        println(Yellow.next)
        println(Green.next)
    }

}

