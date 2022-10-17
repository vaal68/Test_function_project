fun main() {
    printArray(completion())
}
fun completion(): ArrayList<Int>{
    val ints = 1..10
    val intArray = arrayListOf<Int>()
    for (element in ints)
        intArray.add(element)
    return intArray
}
fun printArray(value: ArrayList<Int>){
    println(value)
}