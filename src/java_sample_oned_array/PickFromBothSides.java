package java_sample_oned_array;
//pick B ele from one side or both sides to get max sum
//eg if B==3, you can either pick 3 from 1st, or 3 from last or 1 from start and 2 from last etc
public class PickFromBothSides {
    public int solve(int[] A, int B) {
        //1st do 1st B ele and then enter loop and keep dec from left and inc in right
        int j=0;
        int sum=0;
        while (B<=A.length && j<B) {
            sum=sum+A[j];
            j++;
        }
        int maxSum=sum;
        int ptr1=B-1;
        int ptr2=A.length-1;
        while (ptr1>=0) {
            sum=sum-A[ptr1]+A[ptr2];

            if (sum>maxSum) {
                maxSum=sum;
            }
            ptr1--;
            ptr2--;
        }
        return maxSum;
    }
}
//TC is O(N), SC is O(1)