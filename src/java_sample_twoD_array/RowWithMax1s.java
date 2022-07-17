package java_sample_twoD_array;

import java.util.ArrayList;
import java.util.Scanner;

//given a binary sorted array, find the row with max 1's in O(N) time
public class RowWithMax1s {
    //use staircase technique
    //since array is sorted, there cannot be any 0's ater 1's
    //so start from 1st and col from last
    //if we get 0, move to next row and check if 1
    //eg in 1st row if we get 3 1's, the min ans is 3 atleast and then check next rows in same
    //column to see if we have more 1's
    public static int solve(int[][] A) {
        int i=0;
        int j=A[0].length-1;
        int index=0;
        while (j>=0 && i<A.length) {
            if (A[i][j]==1) {
                index=i;
                j--;
            }

            else if (A[i][j]==0) {
                i++;

            }
        }
        return index;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int[][]A=new int[R][C];

        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println(solve(A));
    }

}
//TC is O(N), SC is O(1)