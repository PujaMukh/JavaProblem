package java_sample_twoD_array;
//return an array containing all row sum 1st and then column sum 1st (given a matrix)

import java.lang.*;
import java.util.*;
public class RowColumnSum {
    static ArrayList<Integer> sumRowColumn(int[][]A) {
        int R=A.length;
        int C=A[0].length;

        //now make an arraylist to store the output
        ArrayList<Integer>output=new ArrayList<Integer>();
        for (int i=0; i<R; i++) {
            int sum=0;
            for (int j=0; j<C; j++) {
                sum=sum+A[i][j];
            }
            output.add(sum);

        }
        for (int j=0; j<C; j++) {
            int sum=0;
            for (int i=0; i<R; i++) {
                sum=sum+A[i][j];
            }
            output.add(sum);

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
        ArrayList<Integer>D=sumRowColumn(A);
        int M=D.size();

        for (int i=0; i<M; i++) {
            System.out.print(D.get(i)+" ");
        }
    }
}
