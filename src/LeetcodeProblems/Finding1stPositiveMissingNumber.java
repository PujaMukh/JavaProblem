package LeetcodeProblems;
//leetcode 41 (hard)
public class Finding1stPositiveMissingNumber {
    public int firstMissingPositive(int[] nums) {
        //iterate in place and remove all -ve nos with any value >=N+2 (coz of search range 1-n)
        //mark with -ve no and take absolute value in this situation as there can be 2 same nos, then we dont want to make 2 -ve as +ve.
        //iterate and get 1st +ve no (index+1)

        for (int i=0; i<nums.length; i++) {
            if (nums[i]<=0) {           //replace all -ve with any no >=N+2
                //0 is not considered +ve, 0 is neutral, so 1st +ve is 1
                nums[i]=nums.length+2;
            }
        }
        for (int i=0; i<nums.length; i++) {
            int ele=Math.abs(nums[i]);
            if (ele>=1 && ele<=nums.length) { //if we have a value outside of length, we dont need it
                nums[ele-1]=-1*Math.abs(nums[ele-1]) ; //absolute value coz if there are 2 nos which are same, -ve twice will become +ve and will give wrong ans in last iteration
            }

        }
        //last iteration to find the index of 1st no which is +ve. ans will be index+1
        for (int i=0; i<nums.length; i++) {
            if (nums[i]>0) {
                return i+1;
            }
        }
        //if we come out of loop without ans, that means we have 1,2,3,4,5....etc etc
        //then ans will be n+1
        return nums.length+1;


    }
}
