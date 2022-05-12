package LeetcodeProblems;
//twosum problem in N^2
//leetcode no 1
//given an array and a target, return indeces from array which add upto the target

import java.lang.*;
import java.util.*;
public class TwoSum {
    static int[] twoSum(int[]nums, int target) {
        int N=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        int[]output=new int[2];
        for (int i=0; i<N; i++) {
            int b=target-nums[i];
            int startIndex=-1;

            if (hm.containsKey(b)) {
                startIndex=hm.get(b);
                output[0]=startIndex;
                output[1]=i;
                if (output.length==2) {
                    break;
                }

            }
            else {
                hm.put(nums[i], i);
            }
        }

        return output;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int target=sc.nextInt();
       int[] output1=twoSum(A,target);
       for (int i=0; i<2; i++) {
           System.out.print(output1[i]+" ");
       }
    }
}
//TC is O(N^2), SC is O(1) if not considering o/p
