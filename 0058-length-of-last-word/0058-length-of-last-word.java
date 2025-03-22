/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        
        int length = 0;
        int i = s.length() - 1;
        
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        
        return length;
    }
}
// @lc code=end

