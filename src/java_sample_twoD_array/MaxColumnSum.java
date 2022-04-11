package java_sample_twoD_array;
//given a matrix, find the max from all column sums
import java.lang.*;
import java.util.*;
public class MaxColumnSum {
    static int maxSum(int[][]A) {
        int R=A.length; //number of rows
        int C=A[0].length; //number of columns
        int max_sum=Integer.MIN_VALUE;

        for (int j=0; j<C; j++) {
            int sum = 0;
            for (int i = 0; i< R; i++) {
                sum = sum + A[i][j];
            }
            if (sum>max_sum) {
                max_sum=sum;
            }
        }
        return max_sum;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(); //take input for number of rows
        int C=sc.nextInt(); //take input for number of columns
        int[][]A=new int[R][C]; //declare input matrix

        for (int i=0; i<R; i++) { //take input for matrix elements
            for (int j=0; j<C; j++) {
                A[i][j]=sc.nextInt();
            }
        }

        System.out.println(maxSum(A));
    }
}
//TC is O(N^2), SC is O(1)
