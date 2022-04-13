package java_sample_twoD_array;
//given a matrix, if there is a 0, make that row and column all 0

import java.lang.*;
import java.util.*;
public class RowToColumnZero {
    //logic: 1st iterate and get the row and column index which has 0 and store in 2 arraylists
    //again iterate and change row 1st
    //again iterate and change column next

    static int[][] changeToAllZeroes(int[][]A) {
        int R=A.length; //number of rows
        int C=A[0].length; //number of columns

        ArrayList<Integer>rowIndex=new ArrayList<Integer>(); //to store all row indexes which has 0
        ArrayList<Integer>columnIndex=new ArrayList<Integer>(); //to store all column indexes which has 0

        //1)now traverse and store indexes here 1st
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                if (A[i][j]==0) {
                    rowIndex.add(i);
                    columnIndex.add(j);
                }
            }
        }

        int N=rowIndex.size(); //size of arraylist which has all row index
        int M=columnIndex.size(); //size of arraylist which has all column index

        //2) now traverse again (but not full traverse) and change the rows which has 0 to all 0
        for (int i=0; i<N; i++) {
            int rowToTransform=rowIndex.get(i);
            for (int j=0; j<C; j++) {
                A[rowToTransform][j]=0;
            }
        }

        //3) now traverse again and make the columns 0
        for (int j=0; j<M; j++) {
            int columnToTransform=columnIndex.get(j);

            for (int i=0; i<R; i++) {
                A[i][columnToTransform]=0;
            }

        }
        return A;


    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(); //input for row
        int C=sc.nextInt(); //input for column
        int[][]A=new int[R][C]; //declare input matrix
        for (int i=0; i<R; i++) {//take input for matrix
            for (int j=0; j<C; j++) {
                A[i][j]=sc.nextInt();
            }

        }

        int[][]output=changeToAllZeroes(A);
        //now print
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//TC is O(N*M), SC is O(N+M)
