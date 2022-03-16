package java_sample_twoD_array;
//print a concentric rectangular pattern in 2d matrix

import java.lang.*;
import java.util.*;

public class ConcentricRectangle {
    static int[][] concentricPattern(int A) {
        int N=2*A-1; //number of rows and columns
        //now create a new matrix to store the output
        int[][] mat=new int[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                //for i==j, we need to start at nearest boundary distance
                //every element is min distance from the boundary
                //distance from any point is (i,j, A-1-i, A-1-j
                //now take min of all 4
                mat[i][j]=A-min(min(i,j), min(N-1-i, N-1-j));

            }
        }
        return mat;
    }

    //function to find the minimum distance
    static int min(int a, int b) {
        if (a>b) {
            return b;
        }
      return a;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int A= sc.nextInt();
        int N=2*A-1;
      int [][]mat=concentricPattern(A); //now call the above function and store it in a variable to print it

       for (int i=0; i<N; i++) { //print it
           for (int j=0; j<N; j++) {
               System.out.print(mat[i][j]+" ");
           }
           System.out.println();
       }
    }
}
