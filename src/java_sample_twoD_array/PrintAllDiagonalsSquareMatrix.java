package java_sample_twoD_array;
//given a square matrix, print all diagonals from right to left

import java.lang.*;
import java.util.*;
public class PrintAllDiagonalsSquareMatrix {
    static void printDiagonals(int[][] A) {
        int R = A.length;

        ///iterating on 1st row, so column is changing
        for (int j = 0; j < R; j++) {
            int i = 0;
            int x = i;
            int y = j;
            while (x < R && y >= 0) {
                System.out.print(A[x][y] + " ");
                x++;
                y--;
            }
            System.out.println();
        }

        //iterating on last column, so row is changing
        for (int i = 1; i < R; i++) {
            int j = R - 1;
            int x = i;
            int y = j;
            while (x < R && y >= 1) {
                System.out.print(A[x][y] + " ");
                x++;
                y--;
            }
            System.out.println();
        }
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
        printDiagonals(A);


    }
}
//TC is O(N^2), SC is O(1)