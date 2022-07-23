package BitManupulation;
//given N array ele, calculate sum of xor of all pairs
public class SumOfXORofAllPairs {
    static int sum(int[] A) {
        int ans=0;
        for (int i=0; i<31; i++) {
            int countSet=0;
            int countUnset=0;
            for (int j=0;j<A.length; j++) {
                if (((A[j]>>i) & 1)==1) { //check if ith bit set
                    countSet++;
                }
                else {
                    countUnset++;
                }
            }
            int total=countSet+countUnset;
            ans=ans+total*(1<<i);
        }
        return 2*ans;
    }
}
//TC is O(N), SC is O(1)