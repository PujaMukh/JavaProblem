package java_sample_twoD_array;
//find the max submatrix sum using kadens algo
import java.util.ArrayList;

public class MaxSumSubmatrix {
    static int Kadane(ArrayList<Integer> row) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0; i<(int)row.size(); i++) {
            sum=sum+row.get(i);

            if (sum>maxSum) {
                maxSum=sum;
            }
            if (sum<0) {
                sum=0;
            }
        }
        return maxSum;

    }
    public int solve(int[][] A) {
        int r=A.length;
        int c=A[0].length;

        //create prefix sum matrix of row
        int[][] pfsum=new int[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (j==0) {
                    pfsum[i][j]=A[i][j];
                }
                else {
                    pfsum[i][j]=pfsum[i][j-1]+A[i][j];
                }

            }
        }

        int maxSum=Integer.MIN_VALUE;
        for (int i=0; i<c; i++) {
            for (int j=i; j<c; j++) {
                ArrayList<Integer>v=new ArrayList<>();
                for (int k=0; k<r; k++) {
                    int el=0;
                    if (i==0) {
                        el=pfsum[k][j];
                    }
                    else {
                        el=pfsum[k][j]-pfsum[k][i-1];
                    }
                    v.add(el);
                }
                maxSum=Math.max(maxSum,Kadane(v));
            }
        }
        return maxSum;

    }
}
