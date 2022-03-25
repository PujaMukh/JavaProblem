package java_sample_twoD_array;
import java.lang.*;
import java.util.*;
public class SameMatrix {
    static int sameMat(int[][]A, int[][]B) {
        int R=A.length;
        int C=A[0].length;

        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                if (A[i][j]==B[i][j]) {

                }
                else {
                    return 0;
                }
            }
        }
        return 1;
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
        int[][]B=new int[R][C];
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println(sameMat(A,B));
    }
}
