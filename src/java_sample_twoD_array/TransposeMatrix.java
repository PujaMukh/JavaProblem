package java_sample_twoD_array;
//create transpose of a matrix A
import java.lang.*;
import java.util.*;
public class TransposeMatrix {
    static int[][] transposeOfMatrix(int[][]A) {
        //return type will be a matrix

        int R=A.length;
        int C=A[0].length;

        int[][]B=new int[C][R]; //create a new matrix B to store output

        for (int i=0; i<R; i++) { //logic to get the output matrix B
            for (int j=0; j<C; j++) {
              B[j][i]=A[i][j];
            }
        }
        return B; //return matrix B
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int R=sc.nextInt(); //take input for number of rows in A matrix
        int C=sc.nextInt(); //take input for number of columns in A matrix

        int[][] A=new int[R][C]; //create a blank input matrix A with R rows and C columns

        for (int i=0; i<R; i++) {    //loop to take input for all values in input matrix A
            for (int j=0; j<C; j++) {
                A[i][j]=sc.nextInt();
            }
        }

        int[][]B=transposeOfMatrix(A); //storing the return in above function in an output matrix B

        for(int i=0; i<C; i++) {     //loo to print all blocks in output matrix B
            for (int j=0; j<R; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println(); //new line after each row
        }

    }
}
