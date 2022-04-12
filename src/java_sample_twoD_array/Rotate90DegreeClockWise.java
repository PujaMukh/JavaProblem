package java_sample_twoD_array;

import java.lang.*;
import java.util.*;

//given a square matrix, rotate 90 degree clockwise with bottom right as center
public class Rotate90DegreeClockWise {
    static int[][] rotateMatrix(int[][]A) {
        //Hint:use transpose to get rotation so rows become column and vice versa
        //reverse all rows separately after transpose

        int N=A.length; //rows and columns

        //transpose in place
        for(int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }

        //reverse each row now
        for (int i=0; i<N; i++) {
            for (int j=0; j<N/2; j++) {
                int temp=A[i][N-1-j];
                A[i][N-1-j]=A[i][j];
                A[i][j]=temp;
            }

        }
        return A;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(); //take input for number of rows and columns

        int[][]A=new int[R][R]; //declare input matrix

        for (int i=0; i<R; i++) { //take input for matrix elements
            for (int j=0; j<R; j++) {
                A[i][j]=sc.nextInt();
            }
        }

        int[][]output=rotateMatrix(A);
        for (int i=0; i<R; i++) {
            for (int j=0; j<R; j++) {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//TC O(N^2), SC is O(1)
