class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val ab = "$a$b".toInt()
        val ba = "$b$a".toInt()

        return if (ab > ba) ab else ba
    }
}