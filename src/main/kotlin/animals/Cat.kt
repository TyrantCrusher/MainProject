package animals

class Cat(name: String, age: Int, val color: String, val breed: String) : Animal(name, age) {
    fun purr() {
        println("Мур")
    }
}