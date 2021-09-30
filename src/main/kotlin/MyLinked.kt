class MyLinkedList {
    private data class Node(var nodeValue: Int, var next: Node? = null)
    private var head: Node? = null

    fun insert(n: Int)  {
        if(head ==  null) head = Node(n,null)
        else {
            var currentNode = head
            while (currentNode?.next !=  null){
                currentNode = currentNode.next
            }
            currentNode?.next = Node(n)
        }
    }
    fun print() {
        var cur = head
        while(cur != null) {
            print("${cur.nodeValue} ")
            cur = cur.next
        }
    }
    fun delete(n: Int){
        if(head == null) return
        var current = head
        while (current?.next != null){
            if(current.next!!.nodeValue == n){
                current.next  = current.next?.next
            }
            current = current.next
        }
    }
}