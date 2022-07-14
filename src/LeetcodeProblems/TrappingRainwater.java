package LeetcodeProblems;
//leetcode hard 42
public class TrappingRainwater {
    public int trap(int[] A) {
        //min(maxleft, maxright)-height
        //if this above becomes -ve, make it 0

        //construct prefixmax from front
        int[] pfFront=new int[A.length];
        pfFront[0]=A[0];
        for (int i=1; i<A.length; i++) {
            if (A[i]<pfFront[i-1]) {
                pfFront[i]=pfFront[i-1];
            }
            else {
                pfFront[i]=A[i];
            }
        }

        //construct prefixmax from back
        int[] pfBack=new int[A.length];
        pfBack[A.length-1]=A[A.length-1];
        for (int i=A.length-2; i>=0; i--) {
            if (A[i]>pfBack[i+1]) {
                pfBack[i]=A[i] ;
            }
            else {
                pfBack[i]=pfBack[i+1];
            }
        }
        int ans=0;

        //start from 1 to N-2
        for (int i=1; i<A.length-1; i++) {
            int val=Math.min(pfFront[i-1], pfBack[i+1])-A[i];
            if (val<0) {
                val=0;
            }
            ans=ans+val;
        }
        return ans;

    }
}
