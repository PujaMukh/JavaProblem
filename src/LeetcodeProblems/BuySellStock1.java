package LeetcodeProblems;
//leetcode no 121
//now do it from the back

import java.lang.*;
import java.util.*;

public class BuySellStock1 {
    static int buySell(int[]A) {
        int N=A.length;
        int maxProfit=0;
        int max=A[N-1];

        for (int i=N-2; i>=0; i--) {

            if (max-A[i]>maxProfit) {
                maxProfit=max-A[i];
            }
            else if (A[i]>max) {
                max=A[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(buySell(A));
    }
}
//TC is O(N), SC is O(1)
