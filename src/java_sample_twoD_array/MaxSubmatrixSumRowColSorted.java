package java_sample_twoD_array;
//find max submatrix sum where row and col are sorted
//that means the last row and last col will have greatest value
public class MaxSubmatrixSumRowColSorted {
    public long solve(int[][] A) {
        //make a pfsum row from last row and last col since that will contain the max sum possible
        long sum=0;
        long maxSum=A[A.length-1][A[0].length-1]; //since row and col sorted, so last row and last col wil contain the max sum
        long[][] pfsum=new long[A.length][A[0].length];
        for (int i=A.length-1; i>=0; i--) {
            for (int j=A[0].length-1; j>=0; j--) {
                if (j==A[0].length-1) {
                    pfsum[i][j]=A[i][j];

                    sum=pfsum[i][j];
                    if (sum>maxSum) {
                        maxSum=sum;
                    }
                }
                else {
                    pfsum[i][j]=pfsum[i][j+1]+A[i][j];

                    sum=pfsum[i][j];
                    if (sum>maxSum) {
                        maxSum=sum;
                    }
                }

            }
        }


        sum=0;
        for (int j=A[0].length-1; j>=0; j--) {
            sum=0;
            for (int i=A.length-1; i>=0; i--) {
                sum=sum+pfsum[i][j]; //sum=4

                if (sum>maxSum) {
                    maxSum=sum;
                }
            }
        }
        return maxSum;


    }
}
//TC is O(N^2), SC is O(N) because of prefix sum matrix