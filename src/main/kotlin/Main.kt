import kotlin.random.Random


fun main(args: Array<String>) {
    val arr : Array <Int> = Array<Int>(10, {Random.nextInt(0,100)})
    var sum = 0
    for (item in arr) sum+=item
    println(sum)
}