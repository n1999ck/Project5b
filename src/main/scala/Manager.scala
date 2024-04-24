class Manager(override val name: String, val store: Store) extends Staff{
  def openStore() : Unit = {
    println(name + " opens the store")
    for(animal <- store.animals) {
      animal.makeNoise()
    }
  }
  def closeStore() : Unit = {
    println(s"$name closes the store")
    for (animal <- store.animals) {
      animal.sleep()
    }
  }

  override def checkTime(time: String): Unit = {
    if (time == "0800") {
      arrive()
      openStore()
    }
    else if (time == "1200") {
      lunch()
    }
    else if (time == "1800") {
      closeStore()
    }
  }

}
