package hashing;

import java.lang.*;
import java.util.*;

//return the length of the min distance special indexes.
//special index are index when the value at both are equal.
//length=|1st index-last index|
public class ShaggyAndDistances {
    static int solve(int[] A) {
        int N=A.length;
        int minLength=Integer.MAX_VALUE;
        long length=0;
        HashMap<Integer, Integer>hm=new HashMap<Integer,Integer>();
        for (int i=0; i<N; i++) {

            if (hm.containsKey(A[i])) {
                long val=hm.get(A[i]);
                length=i-val;

                if (length<minLength) {
                    minLength=(int)length;
                }

            }
            else {
                hm.put(A[i],i);
            }
        }
        if (minLength==Integer.MAX_VALUE) {
            return -1;
        }
        return minLength;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(solve(A));
    }
}
//TC is O(N), SC is O(N)