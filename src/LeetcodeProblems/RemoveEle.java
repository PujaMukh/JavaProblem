package LeetcodeProblems;
//leetcode no 27
//put all ele with val equal to val at last
public class RemoveEle {
    public int removeElement(int[] nums, int val) {
        int ptr1=0;

        for (int ptr2=0; ptr2<nums.length; ptr2++) {

            if (nums[ptr2]!=val) {
                nums[ptr1]=nums[ptr2];
                ptr1++;

            }
        }
        return ptr1;

    }
}
