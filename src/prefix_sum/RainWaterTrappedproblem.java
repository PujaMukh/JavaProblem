package prefix_sum;

public class RainWaterTrappedproblem {
    public int trap(final int[] A) {
        int val=0;
        int ans=0;
        //min(maxleft, maxright)-height
        //if above ans comes -ve, make it 0
        //only consider from 1 to n-2

        //construct pfmax from front
        int[] pfmaxFront=new int[A.length];
        pfmaxFront[0]=A[0];
        for (int i=1; i<A.length; i++) {
            if (A[i]<pfmaxFront[i-1]) {
                pfmaxFront[i]=pfmaxFront[i-1];
            }
            else {
                pfmaxFront[i]=A[i];
            }
        }

        //construct pfmax from back
        int[] pfmaxBack=new int[A.length];
        pfmaxBack[A.length-1]=A[A.length-1];
        for (int i=A.length-2; i>=0; i--) {
            if (A[i]>pfmaxBack[i+1]) {
                pfmaxBack[i]=A[i];
            }
            else {
                pfmaxBack[i]=pfmaxBack[i+1];
            }
        }

        for (int i=1; i<A.length-1; i++) {
            //min(maxleft, maxright)-height
            //if above ans comes -ve, make it 0
            val=Math.min(pfmaxFront[i-1], pfmaxBack[i+1])-A[i];
            if (val<0) {
                val=0;
            }
            ans=ans+val;

        }
        return ans;
    }
}
