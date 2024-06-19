/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        return (new StringBuilder(Integer.toString(x))).toString().equals((new StringBuilder(Integer.toString(x)).reverse().toString()));
    }
}
// @lc code=end

