package java_sample_twoD_array;
//return sum of main diagonals in a matrix.
//main diagonals mean index[1][1],[2][2] etc....
public class MainDiagonalSum {
    static int mainDiagonalSum(int[][] A) {
        int r=A.length;
        int c=A[0].length;
        int sum=0;
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (i==j){
                    sum=sum+A[i][j];
                }
            }
        }
        return sum;
    }
}
