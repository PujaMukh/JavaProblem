package hashing;
import java.lang.*;
import java.util.*;
//count the number of pairs with given XOR. Pairs cannot duplicate
public class CountPairswithGivenXOR {
    static int solve(int[] A, int B) {
        //hint:A[i]^A[j]==B if and only if A[i]^B==A[j]
        //so store A[i]^B in a hashset and if any ele is equal to this, then c++
        int N=A.length;
        int count=0;
        HashSet<Integer>hs=new HashSet<Integer>();
        for (int i=0; i<N; i++) {

            int ele=A[i]^B;

            if (hs.contains(A[i])) {
                count++;
            }
            else {
                //add element to hs and if later we get an element equal to one in hs, c++
                hs.add(ele);
            }

        }
        return count;


    }
}
//TC is O(N), SC is O(N)