package subarray;

import java.util.ArrayList;
import java.util.Scanner;

//given a binary string, chose 2 index L and R such that we get max no of 1's.
//atmost there can be 1 flip
//consider it is 1 indexed
//return empty array if all 1's
public class FlipBinaryString {
    //do it using kadens algo. If sum<0, make sum=0
    //if 1, sum=sum-1, else sum=sum+1
    static int[] flip(String A) {
        int sum=0;
        int maxSum=0; //maxsum 0 as we dont want entering loop if all 1's
        int left=0;
        int right=0;
        int[] output=new int[2];
        output[0]=left;
        output[1]=right;

        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i)=='0') {
                sum=sum+1;
            }
            else {
                sum=sum-1;
            }

            if(sum>maxSum) {
                maxSum=sum;
                output[0]=left+1; //doing it here as we want smallest indexed
                output[1]=right+1;

            }
            if (sum<0) {
                sum=0;
                left=i+1; //i+1 as left and right inc above
                right=i+1;

            }
            else {
                right=right+1;
            }

        }
        if (maxSum==0) { //didnt do integer.min as we didnt want it entering loop for all 1's
            return new int[0];
        }
        return output;


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int[]output=flip(A);
        for (int i=0; i<2; i++) {
            System.out.print(output[i]+" ");
        }

    }
}
//TC is O(N), SC is O(1)