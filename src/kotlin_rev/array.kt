package kotlin_rev

fun main(){
    val numbers = arrayOf(1,2,3,4,5,)

    numbers[2]= 10
    for (n in numbers.indices){
        println("indices ${n} and values are ${numbers[n]} ")

    }
    println(numbers.size)
}