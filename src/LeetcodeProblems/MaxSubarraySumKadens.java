package LeetcodeProblems;
//leetcode medium 53
//find the max subarray sum (given +ve and -ve nos)
//use kadens algorithm which states if sum is +ve, keep updating.
//if sum is -ve, start fresh and make the sum as 0
public class MaxSubarraySumKadens {
    static int findMaxSum(int[] nums) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++) {
            sum=sum+nums[i];

            if (sum>maxSum) {
                maxSum=sum; //update maxSum
            }
            if (sum<0) {
                sum=0; //if sum becomes 0, start fresh by making the sum 0 as we dont need previous sums
            }
        }
        return maxSum;
    }
}
//TC is O(N), SC is O(1)