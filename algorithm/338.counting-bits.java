/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 *
 * https://leetcode.com/problems/counting-bits/description/
 *
 * algorithms
 * Medium (65.55%)
 * Likes:    1622
 * Dislikes: 117
 * Total Accepted:    190.4K
 * Total Submissions: 289.9K
 * Testcase Example:  '2'
 *
 * Given a non negative integer number num. For every numbers i in the range 0
 * ≤ i ≤ num calculate the number of 1's in their binary representation and
 * return them as an array.
 * 
 * Example 1:
 * 
 * 
 * Input: 2
 * Output: [0,1,1]
 * 
 * Example 2:
 * 
 * 
 * Input: 5
 * Output: [0,1,1,2,1,2]
 * 
 * 
 * Follow up:
 * 
 * 
 * It is very easy to come up with a solution with run time
 * O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a
 * single pass?
 * Space complexity should be O(n).
 * Can you do it like a boss? Do it without using any builtin function like
 * __builtin_popcount in c++ or in any other language.
 * 
 */
class Solution {
    public int[] countBits(int num) {
        int[] answer = new int[num + 1];
        int standard = 1;
        for (int i = 0; i <= num; i++) {
            if (i == standard) {
                answer[i] = 1;
                standard *= 2;
                continue;
            }
            answer[i] = answer[standard / 2] + answer[i - (standard / 2)];
        }
        return answer;
    }
}
