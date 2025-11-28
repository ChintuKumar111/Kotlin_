package kotlin_rev


fun main(){

    val number = 1;
    // for loop
    for(i in number..10 step 2) {

        if (i == 3) continue
        println(i)

        // loop over character string
        for (ch in "HEllo") {
            println(ch.toUpperCase())
        }
    }
}