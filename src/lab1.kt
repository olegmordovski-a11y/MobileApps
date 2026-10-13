fun printHello() {
    println ("Hello World")
}
fun kotMath() {
    val i: Int = 6
    val n: Double = 6.66
    val k: Int = -3
    val b1 = i.toByte()
    println (k*i)
    println (n*i)
    println (i+k)
    println (b1)
}
fun kotString() {
    val i: String = " Hello"
    val j: String = " Kotlin"
    println ("Hello World"+i+j)
}
fun kotIf() {
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}
fun kotNull() {
    var marbles: Int? = null
    var fishFoodTreats: Int? = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
    var fishFoodTreats1: Int? = 6
    fishFoodTreats1 = fishFoodTreats1?.dec()
    fishFoodTreats1 = fishFoodTreats1?.dec() ?: 0
    println(fishFoodTreats1)
}
fun KotList (){
    val school = listOf("mackerel", "trout", "halibut")
    println(school)
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)
}
fun kotMass(){
    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))
    //val mix = arrayOf("fish", 2)
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)
    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))
}
fun KotCycle(){
    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print(element + " ")
    }
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}
fun main() {
    printHello()
    kotMath()
    kotString()
    kotIf()
    kotNull()
    KotList ()
    kotMass()
    KotCycle()

}