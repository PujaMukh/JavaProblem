package BitManupulation;

import java.util.ArrayList;
import java.util.HashMap;

//given an array, 2 integers appear only once, rest appear twice.
//find the 2 integers in ascending order
public class SingleNumber3 {
    //I did it using hashmap by finding freq
    public int[] solve(int[] A) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for (int i=0; i<A.length; i++) {   //find freq and store in hashmap
            if (hm.containsKey(A[i])) {
                int val=hm.get(A[i]);
                hm.put(A[i], val+1);
            }
            else {
                hm.put(A[i], 1);
            }
        }
        ArrayList<Integer> output=new ArrayList<Integer>();

        for (int i=0; i<A.length; i++) { //store in arraylist
            if (hm.get(A[i])==1) {
                output.add(A[i]);
            }
        }

        int[] ans=new int[2];
        for (int i=0; i<output.size(); i++) {  //store in array
            ans[i]=output.get(i);
        }
        if (ans[0]>ans[1]) {  //return in ascending, if not already in ascending
            int temp=ans[1];
            ans[1]=ans[0];
            ans[0]=temp;
        }
        return ans;


    }
}
//TC is O(N), SC is O(N) because of hashmap