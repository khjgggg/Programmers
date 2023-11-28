class Solution {
    fun solution(n: Int): Int {
        var sum = 0
        if (n % 2 == 0) {
            for (i in 2..n step 2)
                sum += i * i
        } else {
            for (i in 1..n step 2)
                sum += i
        }
        return sum
    }
}