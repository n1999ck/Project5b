import java.util.Random

class Clerk(override val name: String, val store: Store) extends Staff {
  val random = new Random()

  override def checkTime(time: String): Unit = {
    if (time == "0900") {
      arrive()
      feedAnimals()
    }
    else if (time == "1100") {
      playAnimals()
    }
    else if (time == "1300") {
      lunch()
    }
    else if (time == "1600") {
      sellAnimals()
    }
    else if (time == "1700") {
      leave()
    }
  }

  def feedAnimals(): Unit = {
    println(s"$name feeds the animals")
    for(animal <- store.animals) {
      animal.eat()
    }
  }
  def playAnimals(): Unit = {
    println(s"$name plays with the animals")
    for(animal <- store.animals) {
      animal.play()
    }
  }

  def sellAnimals(): Unit = {
    for (animal <- store.animals) {
      if (random.nextInt(5) == 0) {
        println(s"$name sells " + animal.name + " the " + animal.getSpecies())
        store.animals = store.animals.filter(_ != animal)

        // Generate new animal
        val newName: String = store.extraAnimalNames(
          random.nextInt(store.extraAnimalNames.length)
        )
        if (animal.getSpecies() == "cat") {
          store.animals = store.animals :+ new Feline(newName)
        } else {
          store.animals = store.animals :+ new Canine(newName)
        }

        store.extraAnimalNames = store.extraAnimalNames.filter(_ != newName)
        println("New animal " + newName + " the " + animal.getSpecies() + " has been added to the store")
      }
    }
  }
}
