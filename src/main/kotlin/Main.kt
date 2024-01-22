import animals.Cat
import animals.Dog

fun main() {
    val cat: Cat = Cat(name = "Saimon", age = 1, breed = "Nevskiy Maskarad", color = "Orange")
    cat.purr()

    val dog: Dog = Dog(name = "Polkan", age = 4, typeOfFur = "MultiColor")
    dog.bark()
}