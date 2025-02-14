
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 */

// @lc code=start
class Solution {
    public String[] findWords(String[] words) {

        String[] rows = new String[] {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                map.put(c, i);
            }
        }

        List<String> result = new ArrayList<>();
        for (String word : words) {
            int row = map.get(Character.toLowerCase(word.charAt(0)));
            boolean valid = true;
            for (char c : word.toCharArray()) {
                if (map.get(Character.toLowerCase(c)) != row) {
                    valid = false;
                    break;
                }
            }
            if (valid) result.add(word);
        }

        return result.toArray(new String[result.size()]);
        
    }
}
// @lc code=end

