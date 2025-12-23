package kotlin_rev

open class Day{

    open fun add ( a:Int ,b:Int){
        println("sum is $a + $b = "+(a+b))
    }

}

class Result :Day(){
    override fun add(a: Int, b: Int) {
        super.add(a, b)
        println("Multiply is : $a X $b = "+(a*b) )
    }
}

fun main(){
    val result = Result()
  val c  =   result.add(2,3)

    println(c)

}