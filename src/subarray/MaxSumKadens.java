package subarray;

import java.util.ArrayList;
import java.util.Scanner;

//find max sum in subarrays when the elements are positive and negative
public class MaxSumKadens {
    static int findMaxSum(ArrayList<Integer> A) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        //since elements are +ve and -ve, we have to use kaden's algorithm
        //Kaden's algorithm states if sum<0, sum=0
        for (int i=0; i<A.size(); i++) {
            sum=sum+A.get(i);
            if (sum>maxSum) {
                maxSum=sum;
            }
            if (sum<0) {
                sum=0;
            }

        }
        return maxSum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer>A=new ArrayList<>();
        for (int i=0; i<N; i++) {
            A.add(sc.nextInt());
        }
        System.out.println(findMaxSum(A));

    }
}
