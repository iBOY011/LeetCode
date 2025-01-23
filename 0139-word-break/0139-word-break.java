
import java.util.List;

/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 0; i < s.length(); i++) {
            if (!dp[i]) {
                continue;
            }

            for (String word : wordDict) {
                int end = i + word.length();
                if (end <= s.length() && s.substring(i, end).equals(word)) {
                    dp[end] = true;
                }
            }
        }

        return dp[s.length()];
        
    }
}
// @lc code=end

