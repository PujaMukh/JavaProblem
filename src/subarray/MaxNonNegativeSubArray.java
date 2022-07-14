package subarray;

import java.util.ArrayList;

//find the subarray which has max max with all non negative ele
//edge case handled- 0 0 -1 0, ans=0 0
public class MaxNonNegativeSubArray {
    public int[] maxset(int[] A) {
        //find the max sum subarray with non -ve nos
        //if tie, return the max length one //eg 0 0 -1 0= ans= 0 0
        //if still, return the one with min starting index //eg 0 0 -1 0= ans= 0 0
        int sum=Integer.MIN_VALUE;
        int maxSum=Integer.MIN_VALUE;
        int startIndex=0;
        int endIndex=-1;
        int lastStartIndex=0;
        int lastEndIndex=-1;
        int length=0;
        int maxLength=Integer.MIN_VALUE;
        ArrayList<Integer> output=new ArrayList<Integer>();

        for (int i=0; i<A.length; i++) {
            if (sum==Integer.MIN_VALUE) {
                sum=A[i];

            }

            else {
                sum=sum+A[i];
                if (A[i]>=0) {
                    length=length+1;

                }
            }


            if (length>maxLength && sum==0) {
                maxLength=length;
                endIndex=i;
                lastStartIndex=startIndex;
                lastEndIndex=endIndex;

            }


            if (A[i]<0) {
                length=0;
                sum=0;
                endIndex=i-1;
                startIndex=i+1;




            }
            if ( sum>maxSum) {
                maxSum=sum;
                endIndex=i;
                lastStartIndex=startIndex;
                lastEndIndex=endIndex;

            }



        }
        for (int i=lastStartIndex; i<=lastEndIndex; i++) {
            output.add(A[i]);
        }
        int[] newOutput=new int[output.size()];
        for (int i=0; i<output.size(); i++) {
            newOutput[i]=output.get(i);
        }
        return newOutput;

    }
}
