package extra_practise;

import java.util.Scanner;

//find  the transpose of a matrix and find its sum
public class TranposeOfMatrixAndSum {
    static int[][] transposeSum(int[][] A) {
        int[][] Tranpose=new int[A[0].length][A.length];
        for (int j=0; j<A[0].length; j++) {
            for (int i=0; i<A.length; i++) {
                Tranpose[i][j]=A[j][i];
            }
        }
        int[][] sum=new int[A.length][A[0].length];
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                sum[i][j]=A[i][j]+Tranpose[i][j];
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(); //take input for number of rows
        int C=sc.nextInt(); //take input for number of column

        int[][] A=new int[R][C]; //create new array A with size R and C

        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                A[i][j]=sc.nextInt(); //taking inputs for all elements of the matrix
            }
        }
        int[][] output=transposeSum(A);
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }

}
