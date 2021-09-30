fun main(args: Array<String>) {
    var (a,b) = readInts()

    for (i in 1..1000) {
        a *= 3 * i
        b *= 2 * i

        if (a > b) {
            print(i)
            break
        }
    }
}
fun readInts() = readLine()!!.split(' ').map { it.toInt() }
