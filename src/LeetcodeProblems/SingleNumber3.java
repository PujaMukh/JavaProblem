package LeetcodeProblems;

import java.util.ArrayList;
import java.util.HashMap;

//leetcode medium 260
//finding the 2 nos which appear only once (rest appears twice)
public class SingleNumber3 {
    public int[] singleNumber(int[] A) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for (int i=0; i<A.length; i++) {
            if (hm.containsKey(A[i])) {
                int val=hm.get(A[i]);
                hm.put(A[i], val+1);
            }
            else {
                hm.put(A[i], 1);
            }
        }
        ArrayList<Integer> output=new ArrayList<Integer>();

        for (int i=0; i<A.length; i++) {
            if (hm.get(A[i])==1) {
                output.add(A[i]);
            }
        }
        int[] ans=new int[2];
        for (int i=0; i<output.size(); i++) {
            ans[i]=output.get(i);
        }
        return ans;

    }
}
//TC is O(N), SC is O(N)