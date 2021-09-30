fun main(args: Array<String>) {
    val a = readLine()!!.toString()
    var lowCase = 0
    var upperCase = 0
    for(i in a){
      if(i <'a'){
          upperCase++
      } else {
          lowCase++
      }
    }
    if(upperCase>lowCase){
        println(a.toUpperCase())
    } else {
        println(a.toLowerCase())
    }
}