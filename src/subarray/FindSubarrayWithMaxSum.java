package subarray;

import java.util.ArrayList;
import java.util.Scanner;

//find the subarray with max sum and return the subarray
//will use kadens approach
public class FindSubarrayWithMaxSum {
    static ArrayList<Integer> findSubArray(int[] A) {
        int sum=0;
        int lastStartIndex=0;
        int lastEndIndex=-1;
        int maxSum=Integer.MIN_VALUE;
        int startIndex=0; //eg 1 2 0
        int endIndex=-1;

        ArrayList<Integer> output=new ArrayList<Integer>();
        for (int i=0; i<A.length; i++) {
            sum=sum+A[i];

            if (sum>=maxSum) {
                maxSum=sum;
                endIndex=i;
                lastStartIndex=startIndex;
                lastEndIndex=endIndex;

            }

            if (sum<0) {
                sum=0;

                startIndex=i+1;
                endIndex=i+1;
            }
        }
        if (startIndex!=-1 && endIndex!=-1) {
            for (int i=startIndex; i<=endIndex; i++) {
                output.add(A[i]);
            }

        }
       return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer>output=new ArrayList<>();
        int[] A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        output=findSubArray(A);
        for (int i=0; i<output.size(); i++) {
            System.out.print(output.get(i)+" ");
        }
    }
}
//TC is O(N), SC is O(1)