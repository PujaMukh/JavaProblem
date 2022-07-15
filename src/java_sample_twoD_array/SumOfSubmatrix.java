package java_sample_twoD_array;
//given a matrix, find sum of given submatrix

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfSubmatrix {
    public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        //do sum%10^9+7
        //1) construct pfsum matrix= pfsum[i-1][j]+pfsum[i][j-1]-pfsum[i-1][j-1]+A[i][j]

        long[][] pfsum=new long[A.length][A[0].length];

        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                if (i==0 && j==0) {
                    pfsum[i][j]=A[i][j];
                    // System.out.print(pfsum[i][j]);
                }
                else if (i==0 && j!=0) {
                    pfsum[i][j]=pfsum[i][j-1]+A[i][j];
                    // System.out.println(pfsum[i][j]);
                }
                else if (i!=0 && j==0) {
                    pfsum[i][j]=pfsum[i-1][j]+A[i][j];
                    // System.out.println(pfsum[i][j]);

                }
                else {
                    pfsum[i][j]=pfsum[i-1][j]+pfsum[i][j-1]-pfsum[i-1][j-1]+A[i][j];
                    // System.out.println(pfsum[i][j]);

                }


            }
        }

        //2) get sum and add to array
        ArrayList<Integer>output=new ArrayList<Integer>();
        int i=0;
        long val=0;
        while (i<B.length) {
            int a1=B[i]-1;
            int b1=C[i]-1;
            int a2=D[i]-1;
            int b2=E[i]-1;
            if (a1==0 && b1==0) {
                val=pfsum[a2][b2];

            }
            else if (b1==0 && a1!=0) {
                val=pfsum[a2][b2]-pfsum[a1-1][b2];

            }
            else if (a1==0 && b1!=0) {
                val=pfsum[a2][b2]-pfsum[a2][b1-1];

            }
            else {
                val=pfsum[a2][b2]-pfsum[a2][b1-1]-pfsum[a1-1][b2]+pfsum[a1-1][b1-1];

            }
            //to handle large -ve sums
            while (val<0) {
                val=val+1000000007;
            }
            val=val%1000000007; //to handle large values

            i++;
            output.add((int)val);
        }
        int[] ans=new int[output.size()];
        for (int j=0; j<output.size(); j++) {
            ans[j]=output.get(j);
        }
        return ans;

    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt(); //take input for number of rows of A and B
        int col=sc.nextInt(); //take input for number of columns of A and B

        int[][]A=new int[row][col]; //create new matrix A of R rows and C columns


        for (int i=0; i<row;i++) { //take input for all elements of matrix A
            for (int j=0; j<col; j++) {
                A[i][j]=sc.nextInt();
            }
        }

       int N1=sc.nextInt();
        int[] B=new int[N1];
        for (int i=0; i<N1; i++) {
            B[i]=sc.nextInt();
        }

        int[] C=new int[N1];
        for (int i=0; i<N1; i++) {
            C[i]=sc.nextInt();
        }

        int[] D=new int[N1];
        for (int i=0; i<N1; i++) {
            D[i]=sc.nextInt();
        }

        int[] E=new int[N1];
        for (int i=0; i<N1; i++) {
            E[i]=sc.nextInt();
        }

        int[] output= solve(A,B,C, D, E);
        //since the above function is returning matrix, store it in D matrix

        for (int i=0; i<output.length; i++) {   //for loop to print all blocks of the matrix

                System.out.print(output[i]+" ");

            System.out.println(); //move to a new line after every column
        }
    }
    
}
