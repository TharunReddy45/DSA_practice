// Problem: 53. Maximum Subarray
// Link: https://leetcode.com/problems/maximum-subarray/
// Approach: Kadane’s Algorithm
// Time Complexity: O(n), Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            maxSum = Math.max(maxSum, current);
        }
        return maxSum;
    }
}
