class Canine(name: String) extends Animal(name){
  override val species = "dog"
  override def eat(): Unit = {
    println(s"$name the $species is eating dog food")
  }

  override def play(): Unit = {
    println(s"$name the $species is playing with a squeaky toy")
  }

  override def makeNoise(): Unit = {
    println(s"$name the $species is barking")
  }

  override def checkTime(time: String): Unit = {


  }
}
