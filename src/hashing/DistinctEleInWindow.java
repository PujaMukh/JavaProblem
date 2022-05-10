package hashing;
import java.lang.*;
import java.util.*;
//return in an array count of distinct ele in all subarray of size B
public class DistinctEleInWindow {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        //use window sliding technique
        int N=A.size();
        int count=0;
        ArrayList<Integer>output=new ArrayList<Integer>();
        HashMap<Integer,Integer>hm=new HashMap<Integer, Integer>();
       /* if (B>N) {
            output.add();
        }*/

        // else {
        //do it just for 1st B ele
        for (int i=0; i<B; i++) {
            if (hm.containsKey(A.get(i))) {  //1st B ele freq
                int val=hm.get(A.get(i));
                hm.put(A.get(i), val+1);
            }
            else {
                hm.put(A.get(i),1);
            }

        }
        output.add(hm.size());


        int s=1;
        int e=B;

        while (e<N) {

            int value=hm.get(A.get(s-1)); //dec freq of the element just before start
            hm.put(A.get(s-1), value-1);

            if (hm.get(A.get(s-1))==0) {   //as soon as freq becomes 0, remove that element
                hm.remove(A.get(s-1));
            }

            if (hm.containsKey(A.get(e))) {
                int val=hm.get(A.get(e));
                hm.put(A.get(e), val+1);
            }
            else {
                hm.put(A.get(e),1);
            }
            output.add(hm.size());
            s++;
            e++;
        }

        //}
        return output;
    }
}
