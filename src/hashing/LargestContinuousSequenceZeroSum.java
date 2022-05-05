package hashing;
//return the largest subarray with sum 0

import java.lang.*;
import java.util.*;
public class LargestContinuousSequenceZeroSum {
    static int[] lszero(int[] A) {
        int N=A.length;
        HashMap<Integer,Integer>indexToSum=new HashMap<>(); //declare
        int sum=0;
        int length=0;
        int maxLength=0;
        int startIndex=-1;
        int endIndex=-1;
        ArrayList<Integer>output=new ArrayList<Integer>();
        indexToSum.put(0, -1); //edge case adding key 0 with index value as -1

        for (int i=0; i<N; i++) {
            sum=sum+A[i];
            if ((indexToSum.containsKey(sum))) { //here key is sum because if sum is same later we calculate length
                int val=indexToSum.get(sum); //find value of sum which is the index
                length=i-val;
                if (length>maxLength) {
                    maxLength=length;
                    startIndex=val+1;
                    endIndex=i;
                }

            }
            else { //if sum is not there in the HashMap
                indexToSum.put(sum,i);

            }
        }
        if (maxLength>0) {
            for (int i=startIndex; i<=endIndex; i++) {
                output.add(A[i]);
        }

        }
        int P=output.size(); //this step is just because the question wants array as output
        int[]result=new int[P];
        for(int i=0; i<P; i++) {
            result[i]=output.get(i);
        }
        return result;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int[]output=lszero(A);
        int P=output.length;
        for (int i=0; i<P; i++) {
            System.out.print(output[i]+" ");
        }
    }
}
//TC is O(N), SC is O(N)