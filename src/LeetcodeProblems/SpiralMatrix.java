package LeetcodeProblems;

import java.util.Scanner;

//question no 54
public class SpiralMatrix {
    static int[][] spiralMatrix(int A) {
        //logic: consider 4 corners as left, right, top, bottom
        //consider 1st 0th row and move until we hit rightmost and then traverse top to bottom
        //in last coloumn and so on

        int left = 0;
        int right = A - 1;
        int top = 0;
        int bottom = A - 1;
        int count = 1;
        int[][] output = new int[A][A]; //declare blank matrix to store the output

        while (left <= right && top <= bottom) {

            //traverse 0th row 1st and all columns
            for (int i = left; i <= right; i++) {
                output[top][i] = count;
                count++;
            }
            top++; //move top to row 1 now traverse via last coloumn

            for (int i = top; i <= bottom; i++) {
                output[i][right] = count;
                count++;
            }
            right--; //now last row, move from last but one index to 1st index of last row

            for (int i = right; i >= left; i--) {
                output[bottom][i] = count;
                count++;
            }
            bottom--; //now go from 1st column last but one index to 1st but one index

            for (int i = bottom; i >= top; i--) {
                output[i][left] = count;
                count++;
            }
            left++;

        }
        return output;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();


        int[][] output = spiralMatrix(A);
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//TC is O(N^2)
