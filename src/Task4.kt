fun duplicateTriple(intArray: IntArray) {
    if(intArray.size < 2 ){
        println("Does not exist any array")
        return
    }
    var tripleArray  = ArrayList<Triple<Int, Int, Int>>()
    for(i in intArray.indices){
        outerLoop@ for(j in i+1 until intArray.size ){
            for(k in j+1 until intArray.size){
                if (intArray[i] + intArray[j] + intArray[k] == 2 ){
                    var triplenew = Triple(intArray[i], intArray[j], intArray[k])
                    tripleArray.add(triplenew)
                    break@outerLoop
                }
            }
        }
    }
    for (i in 0 until tripleArray.size){
        for(j in i+1 until  tripleArray.size) {
            if(tripleArray[i].first == tripleArray[j].first && tripleArray[i].second == tripleArray[j].second && tripleArray[i].third == tripleArray[j].third){
                tripleArray.remove(tripleArray[i])
            }
        }
    }
  if(tripleArray.size != 0){
      for(i in tripleArray.indices){
          println("${tripleArray[i]}\t")
      }
  }else{
      println("Does not exist any array")
  }

}

fun main() {
    print("Print numbers of array: ")
    val numbersOfArray = readln()!!.toInt()
    val intArray = IntArray(numbersOfArray)
    for (i in 0 until numbersOfArray) {
        print("Enter A[$i]: ")
        intArray[i] = readLine()!!.toInt()
    }
    duplicateTriple(intArray)
}