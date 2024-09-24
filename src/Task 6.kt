fun pediment(ints: IntArray):Unit {
    val ListTriple = ArrayList<Triple<Int,Int,Int>>()
    if (ints.size < 3) {
        println("Does not exist")
    }
    for(i in 0 until ints.size) {
        outerLoop@ for(j in i+1 until ints.size) {
            for(k in j+1 until ints.size) {
                if(ints[i]+ints[j] > ints[k] || ints[i]+ ints[k] > ints[j] || ints[j]+ints[k] > ints[i]){
                    val trip = Triple(ints[i],ints[j],ints[k])
                    ListTriple.add(trip)
                    break@outerLoop
                }
            }
        }
    }
    for(i in 0 until ListTriple.size) {
        for(j in i+1 until ListTriple.size) {
            if(ListTriple[i].first == ListTriple[j].first && ListTriple[i].second == ListTriple[j].second && ListTriple[i].third == ListTriple[j].third){
                ListTriple.remove(ListTriple[i])
            }
        }
    }
    for(trip in ListTriple){
        println("$trip \t")
    }
}
fun main() {
    print("Enter numbers of array: ")
    val numbersOfArray = readln()!!.toInt()
    val intArray = IntArray(numbersOfArray)
    for (i in 0 until numbersOfArray) {
        print("Enter A[$i]: ")
        intArray[i] = readLine()!!.toInt()
    }
    pediment(intArray)
}