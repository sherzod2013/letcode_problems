fun main(args: Array<String>) {
    var a = readLine()!!.toInt()
    var result = 0
   for(i in 5 downTo 1){
       result += a / i
       a %= i
   }
    print(result)
}