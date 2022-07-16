package java_sample_oned_array;
//find the min number of swaps req to bring all ele <=given B together
public class MinSwapToBringEleTogether {
    public int solve(int[] A, int B) {
        //1)at 1st in full array, find  count of ele <=B. That will be our window
        //2) using 2 pointer for a window of length cnt, keep track of how many ele>B
        //3)if 0th ele (just an eg) if bad value, while moving fwd in window method, reduce the BV
        //else if last ele added while moving window, if that is >B, bad++
        //at the end return math.min
        int good=0;
        //1)
        for (int i=0; i<A.length; i++) {
            if (A[i]<=B) {
                good++;
            }
        }
        int bad=0;
        //2) for 1st good window, keep a count of how many are bad
        for (int i=0; i<good; i++) {
            if (A[i]>B) {
                bad++;
            }
        }
        int ans=bad; //so that we can do Math.min(ans, bad)
        //3)
        int i=0;
        int j=good;
        while (j<A.length) {
            if (A[i]>B) { //suppose 0th ele was>B, we can reduce bad
                bad--;
            }
            if (A[j]>B) { //if the new ele in new window is >B, add the bad
                bad++;
            }
            ans=Math.min(ans, bad);
            i++;
            j++;
        }
        return ans;


    }
}
//TC is O(N), SC is O(1)