/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int rev = 0;   // reverse number
        int temp = x;  // original number
        while (temp>0) {    
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        return rev==x;
    }
}
// @lc code=end

