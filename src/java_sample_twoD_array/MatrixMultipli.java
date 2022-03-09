package java_sample_twoD_array;
import java.lang.*;
import java.util.*;

public class MatrixMultipli {
    //multiply 2 matrices A and B
    static int[][] matMultiply(int[][] A, int[][] B) {


        int r1 = A.length; //row size of matrix A
        int c1 = A[0].length; //column size of matrix A

        int r2 = B.length; //row size of matrix B
        int c2 = B[0].length; //column size of matrix B

        int[][] C = new int[r1][c2]; //create new matrix C to store the output

        for (int i = 0; i < r1; i++) { //loop for rows in output matrix
            for (int j = 0; j < c2; j++) { //loop for columns in output matrix
                int sum = 0; //initialize sum to 0
                for (int k = 0; k < r2; k++) { //loop for iteration to calculate each block in putput matrix
                    sum = sum + (A[i][k] * B[k][j]);
                }
                C[i][j] = sum; //store the value of sum in each block in output matrix C
            }
        }
        return C; //return the output matrix C
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt(); //take input for number of rows in matrix A
        int c1 = sc.nextInt();  //take input for number of columns in matrix A

        int r2 = sc.nextInt();  //take input for number of rows in matrix B
        int c2 = sc.nextInt();   //take input for columns of rows in matrix B

        int[][] A = new int[r1][c1]; //declare a blank matrix A for input
        int[][] B = new int[r2][c2]; //declare a blank matrix B for input

        for (int i = 0; i < r1; i++) {   //loop to take input elements in input matrix A
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r2; i++) {   //loop to take input elements in input matrix B
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] C = matMultiply(A, B);
        ; //store the above function in new output matrix C

        if (c1 == r2) {   //enter this loop only if matrix multiplication if possible
            for (int i = 0; i < r1; i++) {     //loop to print each element in C 1 by 1
                for (int j = 0; j < c2; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println(); //new line before going to next row
            }
        }
        else {  //if c1!=r2, the multiplicaton isn't possible
            System.out.print("matrix multiplication not possible");
        }
    }
}