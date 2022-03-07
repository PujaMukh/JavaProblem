package java_sample_twoD_array;
import java.lang.*;
import java.util.*;
//given a matrix of size[R] [C], print row wise sum
public class RowSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); //take input for number of rows
        int C = sc.nextInt(); //take input for number of columns

        int[][] A = new int[R][C]; //declare a blank matrix A of size R and C


        for (int i = 0; i < R; i++) { //for loop to take all elements for rows
            for (int j = 0; j < C; j++) { //for loop to take all elements for columns
                A[i][j] = sc.nextInt(); //taking input for each grid
            }
        }
            for (int i = 0; i < R; i++) { //for loop to calculate row wise sum
                int sum = 0; //after each row sum will initialize to 0
                for (int j = 0; j < C; j++) {
                    sum = sum + A[i][j];
                }
                System.out.println(sum); //print sum of each row
            }
    }
}
