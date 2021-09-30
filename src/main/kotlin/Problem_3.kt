fun main(args: Array<String>) {
    val text =  readLine().toString()
    println(lengthOfLongestSubstring(text))
}
fun lengthOfLongestSubstring(s: String): Int {
    if (s == "") return 0
    if(s ==  " ") return 1
    var temp: String = ""
    var res = ""
    var max = 1
        for (i in s.indices) {
            if (temp.contains(s[i])) {
                temp = s[i].toString()
            } else {
                temp += s[i]
            }
            if (temp.length > max) max = temp.length
        }
    return max
}
