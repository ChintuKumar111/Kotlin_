package kotlin_rev

fun main(){
    println("Create an integer array and print the first, last, and size of the array.")

    val list = arrayOf(10,20,30,40,50,60)
    for ( n in list){
        println("${list.first()} first number ")
        println("${list.last()} last number")
        println("${list.size} size of array ")
        break
    }
}