package kotlin_rev

fun main(){
    println("Check if an array contains \"Apple\".")

    val listContains = arrayOf( "grapes", "orange","apple ")
    for (n in listContains){

        if(n.contains("apple")){

            println("element is present ${n}")

        }else
        {
            println("element is not present ..")

        }
    }
}