import java.util.Random
import scala.collection.mutable.ListBuffer
class Store(
             val timer: Clock = new Clock(),
             var cats: Array[Feline] =
      Array(new Feline("Cookie"), new Feline("PJ"), new Feline("Jack")),
             var dogs: Array[Canine] =
      Array(new Canine("Rex"), new Canine("Buddy"), new Canine("Max")),
             var extraAnimalNames: Array[String] = Array(
      "Dogg",
      "Obamna",
      "Snoopy",
      "Penguin",
      "Frito",
      "Momo",
      "Cloudy",
      "Freak",
      "Potato",
      "Splenda",
      "Barbara",
      "Camaro",
      "Badger",
      "Eloise",
      "Pineapple"
    ),
             val random: Random =  new Random()
) extends Entity {

  timer.addBeing(this)
  var animals: ListBuffer[Animal] = new ListBuffer[Animal]
  var day = 1
  var localTime = timer.tellTime()
  val manager: Manager = new Manager("Bob", this)
  val clerk: Clerk = new Clerk("Clem", this)
  timer.addBeing(manager)
  timer.addBeing(clerk)

  for(cat <- cats) {
    animals.append(cat)
  }
  for(dog <- dogs) {
    animals.append(dog)
  }

  override def checkTime(time: String): Unit = {
    if (time == "1200") {
      println("Lunch time!")
    }
  }


  def runDays(): Unit = {
    timer.runTimer(3)
  }
}
