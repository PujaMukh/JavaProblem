package subarray;

import java.util.ArrayList;

//given an array containing heights of christmas tree and another array containing cost of
//the same trees, eg A[0] will be height of 0th tree and B[0] will be cost of 0th tree,
//choose 3 trees where index are in ascending order and values are also in ascending order in height
//array, so that the cost of all 3 trees are minimum
public class ChristmasTree {
    //logic: keep a middle and traverse left and right and keep updating minsum
    //brute force will be O(N^3)

    static int findMinCost(ArrayList<Integer>A, ArrayList<Integer> B) {
        int N=A.size();
        int minSum=Integer.MAX_VALUE;

        for (int j=1; j<N-1; j++) { //fixing mid
            int sum=0;
            int left=Integer.MAX_VALUE;
            int right=Integer.MAX_VALUE;

            //left traverse
            for (int i=0; i<=j-1; i++)  {
                if (A.get(i)<A.get(j)){
                    left=Math.min(left, B.get(i));
                }
            }
            //right traverse
            for (int k=j+1; k<N; k++) {
                if (A.get(j)<A.get(k)) {
                    right=Math.min(right, B.get(k));
                }
            }
            if (left!=Integer.MAX_VALUE && right!=Integer.MAX_VALUE) {
                sum=left+B.get(j)+right;
                minSum=Math.min(sum, minSum);
            }

        }
        if (minSum!=Integer.MAX_VALUE) {
            return minSum;
        }
        return -1;

    }
}
