fun main(){
    var attributes=Human("everline",26,62)
    attributes.eat(6)
    println(attributes.weight)
  attributes.speak("I will buy a car soon")
    attributes.birthday()

    var individual=User("Atwoli","Mohammed","atwolimoha@gmail.com",71394326,3258)
    println(individual.firstName)
    println(individual.password)
}
class Human(var name:String,var age:Int,var weight:Int) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
    }

    fun speak(speech: String) {
        println(speech)
    }

    fun birthday() {
        age++
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:Int)