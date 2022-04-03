package prefix_sum;
//given an array and an int B, find the max possible sum from both sides of the array
//eg. if B is 5, we can either take 5 elements from front or back or 1 from front and 4 from back etc

import java.lang.*;
import java.util.*;
public class FindMaxSumBothSides {
    static int findMax(int[]A, int B) {
        int N=A.length;

        //1st we will construct a prefix array from front
        int[]sum_front=new int[N];
        sum_front[0]=A[0]; //edge case

        for (int i=1; i<N; i++) {
            sum_front[i]=sum_front[i-1]+A[i];
        }

        //now construct a sum array from back
        int[]sum_back=new int[N];
        sum_back[N-1]=A[N-1]; //edge case

        for (int i=N-2; i>=0; i--) {
            sum_back[i]=sum_back[i+1]+A[i];
        }

        //now if i=0, take B index from back and 0 from front
        //if i=1, take B-i index from back and i elements from front etc etc
        //if i==B, take B-B elements from back and B-i index from front
        int sum=0;
        int maxsum=Integer.MIN_VALUE; //because array might also contain negative elements
        for (int i=0; i<B; i++) {
            if (i==0) { //edge case
                sum = sum_back[N - B + i];
            }
            else if (i==B) { //edge case
                sum=sum_front[i-1];
            }
            else {
                sum=sum_front[i-1]+sum_back[N-B+i];
            }

            if (sum>maxsum) {  //if the value is coming greater than maxsum, make that maxsum
                maxsum=sum;
            }
        }
        return maxsum;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size
        int[]A=new int[N]; //declare input array

        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all elements in array A
        }
        int B=sc.nextInt(); //take input for int B
        System.out.print(findMax(A, B)); //print
    }
}
//TC is O(N) and SC is O(N)