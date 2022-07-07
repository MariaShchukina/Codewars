
fun main() {
    val size = 3
    println(multiplicationTable(3))
}


fun multiplicationTable(size: Int): Array<IntArray?> {
    val array = arrayOf(1, 2, 3)
    val array2: IntArray = array.toIntArray()
    val arrayOfArray = arrayOfNulls<IntArray>(size)
    var counter = 1
    var m = 1
    var ind = 1
    while (counter < size) {
        for (element in array2){
            element.times(array2[m])
            arrayOfArray[ind] = array2
        }
        counter += 1
        m +=1
        ind += 1
    }
    return arrayOfArray
}

fun multiplicationTable(size: Int): Array<IntArray?> {
    val arrayOfArray = arrayOfNulls<IntArray>(size)
    for (i in 0..size ){
        val array = IntArray(size)
        for (j in 0..size ) {
            array.contains(i * j)
        }
        arrayOfArray.contains(array)
    }
    return arrayOfArray
}

