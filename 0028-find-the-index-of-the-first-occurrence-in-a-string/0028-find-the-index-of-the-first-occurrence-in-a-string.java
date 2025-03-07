/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() == 0) return 0;
        if(haystack.length() == 0) return -1;
        
        int i = 0;
        int j = 0;
        int index = -1;
        
        while(i < haystack.length() && j < needle.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                if(j == 0){
                    index = i;
                }
                j++;
            }else{
                j = 0;
                if(index != -1){
                    i = index;
                    index = -1;
                }
            }
            i++;
        }
        
        if(j == needle.length()){
            return index;
        }
        
        return -1;
    }
}
// @lc code=end

