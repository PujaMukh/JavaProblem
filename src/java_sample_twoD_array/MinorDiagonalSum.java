package java_sample_twoD_array;
//find sum from right to left diagonal
public class MinorDiagonalSum {
    static int findSum(int[][]A) {
        int sum=0;
        int r=A.length;
        int c=A[0].length;

        int i=0;
        int j=c-1;
        while (i<r && j>=0) {
            sum=sum+A[i][j];
            i++;
            j--;
        }
        return sum;
    }
}
