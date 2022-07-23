package BitManupulation;
//given an array, we can perform 2 operations:
//1) either a number can be split into 2 numbers
//2) or 2 numbers can be xor'ed to form a number
//if the final number can be 0, print yes or print no
public class PerformOperations {
    public String solve(int[] A) {
        //xor all ele
        //if ans is even, then yes, else no
        int ans=0;
        for (int i=0; i<A.length; i++) {
            ans=ans^A[i];
        }
        if (ans%2==0) {
            return "Yes";
        }
        return "No";
    }
}
//TC is O(N), SC is O(1)