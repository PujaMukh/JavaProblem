package BitManupulation;
//is it possible to convert a given array to size 1 with value 0 after several splits and xors

import java.lang.*;
import java.util.*;
public class InterestingArray {
    public String solve(ArrayList<Integer> A) {
        //logic: xor all elements.
        //if final ans is even, then it is yes, else no

        int N=A.size();
        int ans=0;

        for (int i=0; i<N; i++) {
            ans=ans^A.get(i);

        }

        if (ans%2==0) {
            return "Yes";
        }
        return "No";
    }
}
//TC is O(N), SC is O(1)
