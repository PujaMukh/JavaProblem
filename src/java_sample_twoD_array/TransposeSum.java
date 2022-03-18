package java_sample_twoD_array;
//Given a square matrix of size N, find its transpose and compute their sum.
//Sample Input:
//2
//1 9
//2 6
//Sample Output:
//2 11
//11 12

import java.lang.*;
import java.util.*;

public class TransposeSum {
    static int[][] sumOfTranspose(int[][]A) {
        //return type will be 2d matrix
        int R=A.length; //number of rows
        int C=A[0].length; //no of columns

        //now make a new matrix C to store the transpose
        int[][]B=new int[C][R];

        for (int i=0; i<R; i++) { //logic
            for (int j=0; j<C; j++) {
                B[j][i]=A[i][j];
            }
        }
        //now matrix B is the transpose of matrix A
        //now make another matrix D to store the sum
        int[][]D=new int[R][C];
        for (int i=0; i<R; i++) { //logic
            for (int j=0; j<C; j++) {
                D[i][j]=A[i][j]+B[i][j];
            }
        }
        return D;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(); //take input for row
        int C=sc.nextInt(); //take input for column

        int[][]A=new int[R][C];

        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                A[i][j]=sc.nextInt(); //take input for all elements of matrix A
            }
        }

        //now make a matrix to store the above function
        int[][]output=sumOfTranspose(A);

        //now print
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
