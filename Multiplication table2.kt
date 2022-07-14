
fun main() {
    val size = 3
    println(multiplicationTable(3))
}


fun multiplicationTable(size: Int): Array<IntArray?> {
    val arrayOfArray = arrayOfNulls<IntArray>(size)
    var indForArrayOfArray = 0
    for (i in 1 .. size ){
        val array = IntArray(size)
        var indForArray = 0
        for (j in 1 .. size ) {
           array[indForArray] = j.times(i)
            indForArray += 1
        }
        arrayOfArray[indForArrayOfArray] = array
        indForArrayOfArray += 1
   }
    return arrayOfArray
}

