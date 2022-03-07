package java_sample_twoD_array;
import java.lang.*;
import java.util.*;
//subtract 2 matrix A and B and return the result in matrix C
public class SubMatrix {
    static int[][] subtractMatrix(int[][]A,int[][]B) { //return type is an array
        int N=A.length; //N is rows
        int M=A[0].length; //M is column

        int[][]C=new int[N][M]; //create new array C to store the output

        for (int i=0; i<N; i++) { //loop to calculate logic
            for (int j=0; j<M; j++) {
                C[i][j]=A[i][j]-B[i][j];
            }
            System.out.println(); //new line before starting a new row
        }
        return C; //returning the output matrix C
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt(); //take input for number of rows
        int M=sc.nextInt(); //take input for number of columns

        int[][]A=new int[N][M]; //create a new input matrix A with N rows and M columns
        int[][]B=new int[N][M]; //create a new input matrix B with N rows and M columns

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                A[i][j]=sc.nextInt(); //take input for all elements in input matrix A
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                B[i][j]=sc.nextInt(); //take input for all elements in input matrix B
            }
        }

        int[][]C =subtractMatrix(A,B); //store the above return matrix in output matrix C

        for (int i=0; i<N; i++) {    //loop to print all blocks
            for (int j=0; j<M; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println(); //new line before moving onto next row
        }

    }
}
