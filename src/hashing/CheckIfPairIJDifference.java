package hashing;

import java.lang.*;
import java.util.*;

//now check if a pair i,j exists such that A[i]-A[j]==k where k is given and i!=j
public class CheckIfPairIJDifference {
    static boolean checkIfPairExists(int[]A, int k) {
        int N=A.length;
        //create a hashmap
        HashMap<Integer,Integer>eleToFreq=new HashMap<>();
        for (int i=0; i<N; i++) {

            if (eleToFreq.containsKey(A[i])) {
                int val=eleToFreq.get(A[i]);
                eleToFreq.put(A[i],val+1);

            }
            else {
                eleToFreq.put(A[i],1);

            }
        }
        for (int i=0; i<N; i++) {
            int b=A[i]-k;
            if (A[i]!=b) {
                if (eleToFreq.containsKey(b)) {
                   return true;
                }
            }
            else if (A[i]==b) {
                if (eleToFreq.get(A[i])>1) {
                    return true;
                }
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
        System.out.println(checkIfPairExists(A,k));
    }

}
//TC is O(N), SC is O(N)
