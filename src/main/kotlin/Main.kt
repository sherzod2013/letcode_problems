fun main(args: Array<String>) {
    println(reverseString("Hello World!"))
    val list = MyLinkedList()
    list.insert(1)
    list.insert(2)
    list.insert(3)
    list.insert(4)
    list.delete(0)
    list.print()
    println(sortBubl(arrayListOf(3,4,56,1,3,6,7,3)))
}

fun findFib(n: Int):Int{
    var current: Int = 1
    var next: Int = 1
    var count: Int = 2
    while(count<=n) {
        val b = current + next;
        current = next;
        next = b;
        count ++
    }
    return next;
}

fun findFibRec(n: Int): Int{
    if(n<=2) return 1
    return findFibRec(n-1) + findFibRec(n-2)
}

fun reverseString(text: String): String {
    var reversedString = ""
    for(i in  text.length-1 downTo 0){
        reversedString+=text[i]
    }
    return reversedString
}

fun  sortBubl(a: ArrayList<Int>): ArrayList<Int>{
    for(i in  0..a.size){
        for(b in 0..a.size-1-i){
            if(a[b]>a[b+1]){
                val temp = a[b]
                a[b]  = a[b+1]
                a[b+1] = temp
            }
        }
    }
    return a
}