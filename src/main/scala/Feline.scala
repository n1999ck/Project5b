class Feline(name: String) extends Animal(name) {
 override val species = "cat"
  override def eat(): Unit = {
    println(s"$name the $species is eating cat food")
  }

  override def play(): Unit = {
    println(s"$name the $species is playing with a ball of yarn")
  }

  override def makeNoise(): Unit = {
    println(s"$name the $species is meowing")
  }
}
