object ByNameAndByValueParameters extends App {
  def rollNumber(i: =>Int) = {
    println("Coco deposited Day1 $1 - Balance=" + i)
    println("Coco deposited Day2 $1 - Balance=" + i)
    println("Coco deposited Day3 $1 - Balance=" + i)
    println("Coco deposited Day4 $1 - Balance=" + i)
    println("Coco deposited Day5 $1 - Balance=" + i)
  }

  var amount = 0
  rollNumber(2)
  rollNumber {
    amount+= 1
    amount
  }
}
