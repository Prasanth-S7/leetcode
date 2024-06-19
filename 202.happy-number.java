/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        for ( int i = 0; i<100000; i++){
            if(n==1){
                 return true;
            }
            int sum =0, m = n;
            while (m!=0){
                sum+=(m%10) * (m%10);
                m/=10;
            }
            n = sum;
        }
        return false;
    }
    
}
// @lc code=end

