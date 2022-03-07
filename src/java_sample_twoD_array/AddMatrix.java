package java_sample_twoD_array;
import java.lang.*;
import java.util.*;
//given 2 matrices A and B, add both and return in another matrix C
public class AddMatrix {
    static int[][] addTwoMatrices(int[][]A, int[][]B) {
        //passing 2 matrices and return type is also a matrix

        int R=A.length;
        int C=A[0].length;

        int[][] D=new int[R][C]; //create a new matrix D to store the return

        for (int i=0; i<R; i++) { //write the logic
            for (int j=0; j<C; j++) {
                D[i][j]=A[i][j]+B[i][j];
            }
        }
        return D; //return the matrix D
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int R=sc.nextInt(); //take input for number of rows of A and B
        int C=sc.nextInt(); //take input for number of columns of A and B

        int[][]A=new int[R][C]; //create new matrix A of R rows and C columns
        int[][]B=new int[R][C]; //create new matrix B of R rows and C columns


        for (int i=0; i<R;i++) { //take input for all elements of matrix A
            for (int j=0; j<C; j++) {
                A[i][j]=sc.nextInt();
            }
        }

        for (int i=0; i<R;i++) { //take input for all elements of matrix B
            for (int j=0; j<C; j++) {
                B[i][j]=sc.nextInt();
            }
        }

        int[][] D= addTwoMatrices(A,B);
        //since the above function is returning matrix, store it in D matrix

        for (int i=0; i<R; i++) {   //for loop to print all blocks of the matrix
            for (int j=0; j<C; j++) {
                System.out.print(D[i][j]+" ");
            }
            System.out.println(); //move to a new line after every column
        }
    }

}
