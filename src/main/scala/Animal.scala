class Animal(var name: String) extends Entity {

  val species = "animal"

  def eat(): Unit = {}
  def play(): Unit = {}

  def getSpecies(): String = {
    species
  }

  def sleep(): Unit = {
    println(s"$name the $species is sleeping")
  }
  def makeNoise(): Unit = {
    print(s"$name is $species is making noise")
  }
}
