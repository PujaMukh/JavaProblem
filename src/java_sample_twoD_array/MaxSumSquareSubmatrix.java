package java_sample_twoD_array;

import java.util.Scanner;

public class MaxSumSquareSubmatrix {
    public static int solve(int[][] A, int B) {
        //make pfsumrow
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        int[][] pfsumrow=new int[A.length][A.length];
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A.length; j++) {

                if (j==0) {
                    pfsumrow[i][0]=A[i][0];
                    System.out.println(pfsumrow[i][j]);
                }
                else {
                    pfsumrow[i][j]=pfsumrow[i][j-1]+A[i][j];
                    System.out.println(pfsumrow[i][j]);
                }
            }
        }


        int row=0;
        int ptr1=0;
        int ptr2=B-1;

        while (row<=A.length-B) {
            sum=0;//while (0<5)

            while (ptr1<B+row) {
                if ((ptr2-B)<0) {
                    sum=sum+pfsumrow[ptr1][ptr2];
                    ptr1++;

                }
                else {
                    sum=sum+pfsumrow[ptr1][ptr2]-pfsumrow[ptr1][ptr2-B];
                    System.out.println(sum);
                    ptr1++;

                }

            }
            if (sum>maxSum) {
                maxSum=sum; //30
            }
            ptr1=row; //ptr1=0
            ptr2++; //ptr2=3
            if (ptr2==A.length) {
                ptr2=B-1;
                row++;
                ptr1=row;
            }

        }
        return maxSum;



    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); //take input for number of rows

        int[][] A = new int[R][R]; //declare input matrix

        for (int i = 0; i < R; i++) { //take input for matrix elements
            for (int j = 0; j < R; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int B=sc.nextInt();
        System.out.println(solve(A,B));



    }
}
//TC is O(N^2), SC is O(N) coz of pfsumrow