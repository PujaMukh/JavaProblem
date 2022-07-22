package BitManupulation;
//given an array, every ele repeats 3 times except 1 which comes once. Find the ele using bit
public class UniqueEle3 {
    //if any bit%3==0, then the unique ele is not contributing anything
    static int findUnique(int[] A) {
        int ans=0;
        for (int i=0; i<31; i++) {
            int count=0;
            for (int j=0; j<A.length; j++) {
                //if ith bit is set, count++
                if (((A[j]>>i)&1)==1) {
                    count++;
                }
            }
            if (count%3==0) {
                ans=ans|(1<<i); (//or, ans=ans+2^i, or, that bit is contributing 2^i to ans)
            }
        }
        return ans;
    }
}
//TC is O(N), SC is O(1)