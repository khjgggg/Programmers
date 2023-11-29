class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return when {
            ineq == ">" && eq == "=" && n >= m -> 1
            ineq == "<" && eq == "=" && n <= m -> 1
            ineq == ">" && eq == "!" && n > m -> 1
            ineq == "<" && eq == "!" && n < m -> 1
            else -> 0
        }
    }
}