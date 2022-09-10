import java.util.Arrays;

/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        //squares of elements in array 
        int n = nums.length;
        for (int i=0;i<n;i++) {
            nums[i] = nums[i]*nums[i];
        }
        //sort array
        Arrays.sort(nums);
        return nums;
    }
}
// @lc code=end

