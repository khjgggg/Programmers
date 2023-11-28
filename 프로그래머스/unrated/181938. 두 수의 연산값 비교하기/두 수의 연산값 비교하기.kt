import kotlin.math.max
class Solution {
    fun solution(a: Int, b: Int): Int {
         val ab = "$a$b".toInt()
           val cal = 2 * a * b
        return max(ab, cal)
        
    }
}