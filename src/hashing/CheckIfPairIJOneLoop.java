package hashing;

import java.lang.*;
import java.util.*;

//check if there exists a pair i,j such that A[i]+A[j]==k and i!=j
//do it in 1 loop and using 1 hashmap and 1 hashset
public class CheckIfPairIJOneLoop {
    static boolean checkIf(int[]A, int k) {
        //hint: iterate and calculate b=k-A[i]
        //for A[i], check if b is already is hashset. If not add A[i]
        //if there, return true
        int N=A.length;
        HashSet<Integer>hs=new HashSet<>();
        for (int i=0; i<N; i++) {
            int b=k-A[i];
            //check if b is already there in hashset. If there, return true coz we have a pair.
            //if not there, remember we already found A[i] via hashset and whenever we get b return true

            if(hs.contains(b)) {
                return true;
            }
            else {
                hs.add(A[i]);
            }

        }
     return false;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(checkIf(A,k));
    }

}
//TC is O(N), SC is O(N). One loop