package hashing;

import java.lang.*;
import java.util.*;

//given N elements and a query, find freq for that query
public class FindFreq {
    static int findFreq(int[]A, int Q) {
        int N=A.length;

        HashMap<Integer,Integer>numberToFreq=new HashMap<>(); //declare
        for (int i=0; i<N; i++) {
            //if it is there, update
            //if not, insert and make freq 1
            if (numberToFreq.containsKey(A[i])) {
                int val=numberToFreq.get(A[i]); //checking the value
                numberToFreq.put(A[i],val+1); //increasing the value if the key is there
            }
            else {
                numberToFreq.put(A[i], 1); //if not there, make the value 1
            }
        }

        if (numberToFreq.containsKey(Q)) {
            return numberToFreq.get(Q); //if teh key is there, return value
        }
        return 0;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int Q=sc.nextInt();
        System.out.println(findFreq(A,Q));
    }
}
//TC is O(N), SC is O(N)