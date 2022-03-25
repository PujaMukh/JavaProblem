package java_sample_twoD_array;
//multiply matrix by given integer

import java.lang.*;
import java.util.*;
public class MatrixMultByInt {
    static int[][] matMult(int[][]A, int B) {
        int R=A.length;
        int C=A[0].length;

        int[][]output=new int[R][C];
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                output[i][j]=A[i][j]*B;
            }
        }
        return output;
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
        int B=sc.nextInt();

        int[][]D=matMult(A,B);
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }
    }

}
