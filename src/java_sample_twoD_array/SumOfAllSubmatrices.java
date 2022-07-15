package java_sample_twoD_array;

public class SumOfAllSubmatrices {
    public int solve(int[][] A) {
        //for every ele calculate in how many submatrices can it fall * A[i][j]
        //top right in how many=(i+1)*(j+1) //considering 0th index
        //bottom right in how many=(m-1-i+1)*(n-1-j+1)
        //sum=sum+count*A[i][j]
        int row=A.length;
        int col=A[0].length;
        int ans=0;

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                int count=(i+1)*(j+1)*(row-1-i+1)*(col-1-j+1);
                ans=ans+count*A[i][j];
            }
        }
        return ans;
    }
}
