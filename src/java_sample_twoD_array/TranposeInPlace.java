package java_sample_twoD_array;

import java.util.Scanner;

//given a square matrix, find the transpose in place, SC should be O(1)
public class TranposeInPlace {
    //hint: again draw it and you will find the pattern
    //the diagonal will remain same
    //swap upper and lower

    static int[][] transposeMatrix(int[][]A) {
        int N=A.length; //row and column

        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {  //we start from 0,1
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
        return A;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(); //take input for number of rows

        int[][]A=new int[R][R]; //declare input matrix

        for (int i=0; i<R; i++) { //take input for matrix elements
            for (int j=0; j<R; j++) {
                A[i][j]=sc.nextInt();
            }
        }
        //now print
        int[][]output=transposeMatrix(A);
        for (int i=0; i<R; i++) {
            for (int j=0; j<R; j++) {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }


    }



}
//TC O(N^2), SC is O(1)
