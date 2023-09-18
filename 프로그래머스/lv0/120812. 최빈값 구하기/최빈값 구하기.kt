class Solution {
   fun solution(array: IntArray): Int {
        var answer: Int = 0
        var maxCount = 0
        var mode = 0

        val numberCounts = mutableMapOf<Int, Int>()

        // 배열 내 각 숫자의 빈도를 계산합니다.
        for (number in array) {
            val count = numberCounts.getOrDefault(number, 0)
            numberCounts[number] = count + 1
        }

        // 최빈값을 찾습니다.
        for ((number, count) in numberCounts) {
            if (count > maxCount) {
                maxCount = count
                mode = number
            } else if (count > 0 && count == maxCount) {
                mode = -1
            }
        }

        answer = mode
        return answer
    }
}