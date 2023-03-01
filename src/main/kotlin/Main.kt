fun main() {
        var human = Human("Sheila", 20, 62)
//        human.eat(2)
    println(human.eat(2))
        human.speak("Hello, I am ${human.name}")
    human.birthday(4)
        human.age
    println(human.age)
//        println(human.age)

    var user = User("Lekishon","Sheila","lekishonsheila@gmail.com","+254-706119709",
        "324536")
    println(user.firstName)
    println(user.email)

}

class Human(var name: String, var age: Int, var weight: Int) {

    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
        println(weight)
    }

    fun speak(speech: String) {
        println(speech)
    }

    fun birthday(age1: Int) {
        age +=4

    }

}
data class User(var firstName: String,var lastName: String,var email: String,var phoneNumber: String,var password: String)


