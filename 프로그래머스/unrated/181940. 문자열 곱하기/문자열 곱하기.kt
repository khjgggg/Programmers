class Solution {
    fun solution(my_string: String, k: Int): String {
        var answer = StringBuilder(my_string.length * k)
        
        repeat(k){
            answer.append(my_string)
        }
        return answer.toString()
    }
}