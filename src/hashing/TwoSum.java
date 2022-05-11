package hashing;
import java.lang.*;
import java.util.*;
//return the indexes of the pair if A[i]+A[j]==target. If nothing exists return empty array
//if duplicate, return min index of starting and min index of ending index
//index are 1 based, not 0 based

public class TwoSum {
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        int N=A.size();
        ArrayList<Integer>output=new ArrayList<Integer>();
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        int minVal=Integer.MAX_VALUE;
        int minEndIndex=Integer.MAX_VALUE;


        for (int i=0; i<N; i++) {
            int b=B-A.get(i);

            if (hm.containsKey(b)) {
                int val=hm.get(b);     //hashmap to store A[i] and index
                int endIndex=i;

                if (val<minVal) {  //to get min start index
                    minVal=val;
                    output.add(val+1);
                }
                if (endIndex<minEndIndex) {  //to get min end index
                    minEndIndex=endIndex;
                    output.add(endIndex+1);
                }
                if (output.size()==2)    {  //break, whenever size is 2 coz we only need 2 indexes
                    return output;
                }
            }
            else if (!hm.containsKey(A.get(i))){ //suppose number repeats we dont want indexes of all same nos
                hm.put(A.get(i),i);

            }
        }

        return output;
    }
}
//TC is O(N), SC is O(N)