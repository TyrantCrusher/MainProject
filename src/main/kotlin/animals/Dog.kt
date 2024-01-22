package animals

class Dog(name: String, age: Int, val typeOfFur: String) : Animal(name, age) {
    fun bark() {
        println("Гав")
    }
}