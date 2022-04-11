package java_sample_twoD_array;
//given a square matrix, print the diagonals
import java.lang.*;
import java.util.*;
public class PrintDiagonalsSquareMatrix {
    static void printDiagonals(int[][]A) {
        int R=A.length; //number of rows
        //not taking columns as in square matrix rows=columns

        //from left to right
        int i=0;
        int j=0;

        while (i<R && j<R) { //no for loop as both have to be incremented parallely
            System.out.println(A[i][j]);
            i++;
            j++;
        }

        //from right to left
        int i1=0;
        int j1=R-1;
        while (i1<R && j1>=0) {
            System.out.println(A[i1][j1]);
            i1++;
            j1--;
        }
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

        printDiagonals(A);
    }

}
//TC is O(N), SC is O(1)
