fun main(args: Array<String>) {

}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    if(l1 == null) return ListNode(0)
    if(l2  == null) return ListNode(0)
    var result: ListNode? = ListNode(0)
    val tempResult = result
    var currentL1 = l1
    var currentL2 = l2
    var temp = 0
    while (hasNext(currentL1) && hasNext(currentL2)) {
        if(result == null) result = ListNode(0)
        result.`val` = currentL1!!.`val`+currentL2!!.`val`
        result.`val` + temp
        temp = result.`val`/10
        result.`val` = result.`val`%10
        if(hasNext(currentL1)){
            currentL1 =  currentL1.next
        }
        if(hasNext(currentL2)) {
            currentL2 = currentL2.next
        }
        result.next = ListNode(0)
        result = result.next
    }
    return tempResult
}

fun hasNext(l: ListNode?): Boolean {
    if (l == null) return false
    return l.next != null
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}