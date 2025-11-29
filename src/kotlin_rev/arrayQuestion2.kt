package kotlin_rev

fun main(){
    println("Create an array of numbers and print only the even numbers.")

    val evenList = arrayOf(2,3,4,5,6,7,8,9,10)
    for (n in 0..evenList.size-1){
        if(n%2==0) {
            println("Even ${n}")
        }
        else  {
            println("odd ${n}")}


    }
}