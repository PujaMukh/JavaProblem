package Window_Sliding;
//find max length subarray of only positive numbers. If same length then return the 1st one

import java.lang.*;
import java.util.*;

public class MaxLengthSubarrayPositiveNumbers {
    static ArrayList<Integer> maxLength(int[]A) {
        //logic: use window sliding technique
        //update maxsum, maxstartindex, maxendindex in the process
        //lastly itearate from maxstartindex to maxendindex and print

        int startIndex=0;
        int endIndex=0;
        int maxStartIndex=-1;
        int maxEndIndex=-1;
        int length=0;
        int maxLength=0;
        ArrayList<Integer>output=new ArrayList<Integer>(); //to store outputs

        int N=A.length;
        while (endIndex<N) {

            if (A[endIndex]>=0) {
                endIndex++;
                length=endIndex-startIndex;
            }
            else {
                startIndex=endIndex+1;
                endIndex=endIndex+1;
            }

            if (length>maxLength) {
                maxLength=length;
                maxStartIndex=startIndex;
                maxEndIndex=endIndex;

            }
        }
        for (int i=maxStartIndex; i<maxEndIndex; i++) {
            output.add(A[i]);
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
        ArrayList<Integer>result= maxLength(A);
        int D=result.size();

        for (int i=0; i<D; i++) {
            System.out.print(result.get(i)+" ");
        }
    }
}
//TC is O(N), SC is O(1) as return type should be an arraylist and we are not using extra space
