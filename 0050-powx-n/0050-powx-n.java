/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {

        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1/x;

        double half = myPow(x, n/2);
        double rest = myPow(x, n%2);

        return half * half * rest;
        
    }
}
// @lc code=end

