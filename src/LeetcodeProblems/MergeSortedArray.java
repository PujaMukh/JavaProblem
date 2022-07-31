package LeetcodeProblems;

import java.util.Scanner;

//leecode no 88
//merge 2 sorted array in ascending order
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //sorted in inc order
        //m=number of ele in nums1
        //n=number of ele in nums2
        //length of nums1=m+n

        //hint: put ptr1 in m and ptr2 at end and dec (since max will be at end of each array)
        //put another ptr at end on nums1 array and compare whichever end is greater

        int ptr1=m-1;
        int ptr2=nums2.length-1;
        int comparePtr=nums1.length-1; //will use it to switch

        while (ptr2>=0) {

            if (ptr1==-1) {
                nums1[comparePtr] = nums2[ptr2];
                comparePtr--;
                ptr2--;
            }
            else {
                if (nums1[ptr1]>nums2[ptr2]) {
                    nums1[comparePtr] = nums1[ptr1];
                    comparePtr--;
                    ptr1--;
                }

                else {

                    nums1[comparePtr] = nums2[ptr2];
                    comparePtr--;
                    ptr2--;
                }
            }

        }




    }

}