package LeetcodeProblems;
//leetcode 35
//Given a sorted array of distinct integers and a target value,
// return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {

            if (nums[i]>target) {
                return i;
            }
            else if (nums[i]==target) {
                return i;
            }
            else if (nums[i]<target) {
                if (i!=nums.length-1 && nums[i+1]>target)
                    return i+1;
            }
        }
        return nums.length;

    }
}
