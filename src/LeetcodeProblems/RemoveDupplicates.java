package LeetcodeProblems;
//leetcode no 26
//remove all duplicates and put in back of array and put unique in front in O(1) space

public class RemoveDupplicates {
    //use 2 pointer approch
    public int removeDuplicates(int[] nums) {

        int ptr1=0;
        int ptr2=1;

        for (ptr2=1; ptr2<nums.length; ptr2++) {

            if (nums[ptr1]!=nums[ptr2]) {
                ptr1++;
                nums[ptr1]=nums[ptr2];
            }
        }
        return ptr1+1;

    }
}
//TC is O(N), SC is O(1)