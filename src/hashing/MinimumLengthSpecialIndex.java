package hashing;
//indexes are said to be special if element at both the indexes are equal.
//Find the min length special index
//eg 7 1 3 4 1 7, and 3 (subtract the index of both 1's)

import java.lang.*;
import java.util.*;
public class MinimumLengthSpecialIndex {
    static int solve(ArrayList<Integer> A) {
        int N=A.size();
        int length=0;
        int minLength=Integer.MAX_VALUE;

        HashMap<Integer, Integer>valueToIndex=new HashMap<>(); //declare

        for (int i=0; i<N; i++) {

            if (valueToIndex.containsKey(A.get(i))) { //if there.....
                int val=valueToIndex.get(A.get(i));
                length=i-val;
                if (length<minLength) {
                    minLength=length;
                }

            }
            else { //if not there, add it
                valueToIndex.put(A.get(i), i); //key is ele and value is index

            }
        }
        if (minLength!=Integer.MAX_VALUE) {
            return minLength;
        }
        return -1;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        ArrayList<Integer>A=new ArrayList<>();
        for (int i=0; i<N; i++) {
            A.add(sc.nextInt());
        }
        System.out.println(solve(A));

    }

}
//TC is O(N) as SC is O(N) because of hashmap
