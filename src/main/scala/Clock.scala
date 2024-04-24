import scala.collection.mutable.ListBuffer

class Clock {
  val beings: ListBuffer[Entity] = new ListBuffer: ListBuffer[Entity]
  val times: Array[String] = Array("0800", "0900", "1100", "1200", "1300", "1600", "1700", "1800")
  var timeNow: Int = 0
  
  def incrtime(): Unit = {
    if(timeNow >= 7){
        timeNow = 0
    }
    else{
        timeNow += 1
    }
  }

  def tellTime(): String = {
    times(timeNow)
  }

  def tick(day: Int): Unit = {
    val time:String = tellTime()
    println("\nThe time is " + tellTime() + " on day " + day)
    announceHour(time)
    incrtime()
  }

  def runTimer(days: Int): Unit = {
    for(day <- 1 to days) {
      println("=================================\nDay " + day + ":\n=================================")
      for(time <- times) {
        tick(day)
      }
    }
  }

  def addBeing(somebody: Entity): Unit = {
    beings.addOne(somebody)
  }

  def removeBeing(somebody: Entity): Unit = {
    beings.filter(_ != somebody)
  }

  def announceHour(time: String): Unit = {
    for(being <- beings) {
      being.checkTime(time)
    }
  }
}
