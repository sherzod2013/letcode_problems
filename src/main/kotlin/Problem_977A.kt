fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(' ').map { it.toInt() }

    for(i in 0 until b){
        if(a%10  == 0){
            a /= 10
        } else {
            a -= 1
        }
    }
    print(a)
}