abstract class Animal {
 def name: String
}

abstract class Pet extends Animal {}

class Cat extends Pet {
  override def name: String = "Cat"
}

case class Dog(lastname: String) extends Pet {
  override def name: String = "Dog"
}

class Lion extends Animal {
  override def name: String = "Lion"
}

//New class PetContainer which takes a type parameter P which must be a subtype of Pet
class PetContainer[P <: Pet](p:P) {
  def pet: P = p
}

class PetSuperContainer[P >: Pet] (p:P) {
   def pet: P = p
}


object Run extends App {
    //New petContainer of Dog Type
    val petContainer = new PetContainer[Dog](new Dog("Fuentes"))
    //val lionContainer = new PetContainer[Lion](new Lion)
    println(petContainer.pet)

    val petSuperContainer = new PetSuperContainer[Pet](new Pet)
}

