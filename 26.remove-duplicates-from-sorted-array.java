/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int a = 1;
        for( int i= 0; i<nums.length-1; i++){
            if((nums[i]^nums[i+1])!=0){
                nums[a] = nums[i+1];
                a++;
            }
        }
        return a;
    }
}
// @lc code=end

