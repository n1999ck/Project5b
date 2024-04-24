class Staff extends Entity{
  val name = ""
  def arrive() : Unit = {
    println(s"$name arrives at the store")
  }

  def lunch() : Unit = {
    println(s"$name goes to lunch")
  }

  def leave() : Unit = {
    println(s"$name leaves the store")
  }

}

