package java_sample_twoD_array;

import java.util.Scanner;

//serach for the given value in a row wise and colimn wise sorted matrix
//if B has multiple in matrix, return the ans with lowest value
//matrix is 1 indexed and ans should be i*1009+j

public class SearchinRowWiseColumnWiseSortedMatrix {
    public static int solve(int[][] A, int B) {
        int i=0;
        int j=A[0].length-1;
        int ans=Integer.MAX_VALUE;
        int minAns=Integer.MAX_VALUE;

        while (i<A.length && j>=0) {
            if (A[i][j]<B) { //since it is sorted, just check last col
                i++;
                j=A[0].length-1;
            }
            else {
                j--;
            }
            if (i<A.length && j>=0) { //so that theres no error like array out of bounds
                if (A[i][j]==B) {
                    ans=(i+1)*1009+(j+1);

                }
                if (ans<minAns) { //if multple values, keep on checking and get the ans for lowest col
                    minAns=ans;
                }

            }

        }
        if (minAns!=Integer.MAX_VALUE) {
            return minAns;
        }
        return -1;


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
        int B=sc.nextInt();
        System.out.println(solve(A,B));


    }
}
//TC is O(N), SC is O(1)