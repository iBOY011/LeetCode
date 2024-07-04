class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int temp = x;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        return x == reverse;

    }
}