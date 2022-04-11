package java_sample_twoD_array;
//given a matrix N*M, print all diagonals from right to left

import java.lang.*;
import java.util.*;
public class PrintDiagonalsinRectangularMatrix {
    static void printAllDiagonals(int[][] A) {
        //we 1st have to iterate on 0th row and then last column
        //1st half on 0th row:
        // i will always start at 0 and increase till N
        //for j, 1st row will b 0, next row will start at j++ and will decrease till j=0

        //2nd half iterating on last column:
        //j will always start at n-1 and dec till row-1
        //i will start at 1 and inc


        int R = A.length;
        int C = A[0].length;


        //iterating on 0th row
        for (int j = 0; j < C; j++) {

            int i = 0;
            int x = i;
            int y = j;

            while (x < R && y >= 0) {
                System.out.print(A[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }


        //iterating on last column
        for (int i = 1; i < R; i++) {
            int j = C - 1;
            int x = i;
            int y = j;

            while (x < R && y > 1) {
                System.out.print(A[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();


        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); //take input for number of rows
        int C = sc.nextInt(); //take input for number of columns
        int[][] A = new int[R][C]; //declare input matrix

        for (int i = 0; i < R; i++) { //take input for matrix elements
            for (int j = 0; j < C; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        printAllDiagonals(A);
    }
}
//TC is O(N^2), SC is O(1)

