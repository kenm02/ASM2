fun lengthOfArray(ints: IntArray, taget: Int): Int {
    val revertedArray = ints.sortedArray()
    var sum = 0
    var time =0

    for(i in 0 until  ints.size) {
        sum += revertedArray[i]
        if(sum <= taget){
            time ++
        }else return time
    }
    return 0
}
fun lengOfArrayWithWhile(ints: IntArray, taget: Int): Int {
    var sum = 0
    var time =0
    var i = 0
    val revertedArray = ints.sortedArray()
    if(revertedArray[0] > taget) return  0
    while(sum <= taget){
        sum += revertedArray[i]
        if(sum > taget){return time}
        time++
        i++
    }
    return 0
}
fun main() {
    print("Enter numbers of array: ")
    val numbersOfArray = readln()!!.toInt()
    val intArray = IntArray(numbersOfArray)
    for (i in 0 until numbersOfArray) {
        print("Enter A[$i]: ")
        intArray[i] = readLine()!!.toInt()
    }
    print("Enter taget: ")
    val taget = readLine()!!.toInt()
    println("Maximum members of array: ${lengthOfArray(intArray, taget)}")
    println("Maximum members of array: ${lengOfArrayWithWhile(intArray, taget)}")

}