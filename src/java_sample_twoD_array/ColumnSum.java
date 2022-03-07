package java_sample_twoD_array;
import java.lang.*;
import java.util.*;
//print column wise sum in a 2D array now calling the function from another function
public class ColumnSum {
    static void sumOfColumn(int[][]A) {
        int R = A.length;
        int C = A[0].length;

        for (int j = 0; j < C; j++) { //1st start with column as we are finding column sum
            int sum = 0; //initialize sum to 0
            for (int i = 0; i < R; i++) {
                sum = sum + A[i][j]; //for each column calculate the total sum
            }
            System.out.println(sum);
        }
    }

        public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
            int R=sc.nextInt(); //take input for number of rows
            int C=sc.nextInt(); //take input for number of column

            int[][] A=new int[R][C]; //create new array A with size R and C

            for (int i=0; i<R; i++) {
                for (int j=0; j<C; j++) {
                    A[i][j]=sc.nextInt(); //taking inputs for all elements of the matrix
                }
            }
            sumOfColumn(A); //calling the above function
        }
}






















