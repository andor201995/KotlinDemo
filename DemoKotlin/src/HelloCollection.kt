fun main(args: Array<String>) {

    //Array
    var arr = Array<Int>(5) { 0 }
    arr[2] = 17

    println("arr= ")
    for (element in arr) {
        print(element)
    }

    //ArrayList
    var arrList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }
    println("\narrList=$arrList")

    //HashMap
    // apply method
    var hashMap1 = HashMap<Int, String>().apply {
        put(1, "Anmol")
        put(2, "Avi")
    }

    // arrayOf,mapOf,listOf....

    var hashMap2 = hashMapOf(1 to "anmol", 2 to "avi")
    println(hashMap2.get(2))
    println(hashMap2[1])

    //List
    var list = listOf<Boolean>(true, false, true, true)                         //return a linked list and immutable list
    var listmutable = mutableListOf<Boolean>(true, false, true, true)     //return mutable list
    for (item in list) {
        print(item)
    }
    //Set
    var set = setOf<Int>(1, 2, 3, 4, 5)
    var setmutable = mutableSetOf<Int>(1, 2, 3, 4, 5, 6)
    setmutable.add(10)


}