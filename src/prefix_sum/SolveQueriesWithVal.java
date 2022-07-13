package prefix_sum;

import java.util.Scanner;

//given an array where every index is 0 and also q queries given(query has index and a value to be added)
//return final array
public class SolveQueriesWithVal {
    //observation-if we have to find from i to j query, all indexes from i to end will inc by th given value
    static int[] createArray(int[] A, int[][] B) { //2d array column size will be 2 with index and value
        //hint: mark the index with the value at only the given index
        //after that perform prefix sum (this will reduce time complexity for Q queries)
       //eg query 2 4 (2 is index, 4 is value)
             //   3 -1
        //        0 2
        //        4 1

            for (int i=0; i<B.length; i++) { //row in 2d matrix
                //1) for every query update value at just the index for now
                int index=B[i][0]; //2
                int value=B[i][1]; //4
                A[index]=A[index]+value; //A[2]=A[2]+4

            }
            //perform prefix sum after this
        int[] pfsum=new int[A.length];
            pfsum[0]=A[0];
            for (int i=1; i<A.length; i++) {
                pfsum[i]=pfsum[i-1]+A[i];
            }
        return pfsum;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        int r=sc.nextInt();
       int[][] B=new int[r][2];
       for (int i=0; i<r; i++) {
           for (int j=0; j<2; j++) {
               B[i][j]=sc.nextInt();
           }
       }
       int[]output=createArray(A,B);
       for(int i=0; i<output.length; i++) {
           System.out.print(output[i]+" ");
       }

    }

}
//TC is O(N), SC is O(N)