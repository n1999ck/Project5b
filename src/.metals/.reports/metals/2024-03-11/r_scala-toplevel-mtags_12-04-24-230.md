error id: file://<WORKSPACE>/main/Store.scala:[219..222) in Input.VirtualFile("file://<WORKSPACE>/main/Store.scala", "import java.util.Random

class Store{
    var day = 1
    var localTime = timer.tellTime()
    var cats: Array[Feline] = Array()
    var dogs: Array[Canine] = Array()
    var staff: Array[Staff] = Array()

    def 
    def announce(): Unit = {
        println("The time is " + localTime + " on day " + day)
        if(localTime == "1200"){
            println("Lunch time!")
        }
        else if(localTime == "1800"){
            day += 1
            println()
        }
    }

    def sellAnimals(): Unit = {
        for(animal <- cats){
            if(java.util.Random.nextInt(5) == 0){
                println("Selling " + animal.name)
                cats = cats.filter(_ != animal)
            }
        }
        for(animal <- dogs){
            println("Selling " + animal.name)
            dogs = dogs.filter(_ != animal)
        }
    }


}")
file://<WORKSPACE>/main/Store.scala
file://<WORKSPACE>/main/Store.scala:11: error: expected identifier; obtained def
    def announce(): Unit = {
    ^
#### Short summary: 

expected identifier; obtained def