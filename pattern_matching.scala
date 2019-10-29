object DadRater { 
    def apply(film: Film):Double =
        film match {
            case Film(_, Director("Clint Eastwood")) => 10.0
            case Film(_, Director("John McTiernan")) => 7.0
            case Film(x, Director(_)) => x match {
                case "Una pelicula" => 888
            }
        } 
}

case class Film (name:String = "Una pelicula", directedBy:Director = Director("David El Guapo"))
case class Director (name:String)

object Runner {
 def main(args: Array[String]): Unit = println(DadRater(Film()))
}

