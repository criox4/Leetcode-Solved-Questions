/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {           // for each element in array
            sum += nums[i];                     // add element to sum
            if (sum > max) {                    // if sum is greater than max
                max = sum;
            }
            if (sum < 0) {                      // if sum is less than 0
                sum = 0;
            }
        }
        return max;
    }
}
// @lc code=end
