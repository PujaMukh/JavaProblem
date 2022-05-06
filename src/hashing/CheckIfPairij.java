package hashing;

import java.lang.*;
import java.util.*;
//eg. 8 9 1 -2 4 5 11 -6 7 5
//check if there exists a pair i,j such that A[i]+A[j]==k (given) and i!=j in O(N) time
public class CheckIfPairij {
    static boolean checkIfPairExists(int[]A, int k) {
        int N=A.length;
        HashMap<Integer,Integer>eleToFreq=new HashMap<>(); //declare
        //create a hashmap with elements and their frequencies
        for (int i=0; i<N; i++) {

            if (eleToFreq.containsKey(A[i])) { //if there....
                int val=eleToFreq.get(A[i]); //get the value
                eleToFreq.put(A[i], val+1); //increase freq by 1
            }
            else{
                eleToFreq.put(A[i],1); //if not there, make frequency 1
            }
        }
        //check for k-A[i] in the array.
        for (int i=0; i<N; i++) {
            int b=k-A[i];
            if (A[i]!=b) { //eg k=11....if a and b are different
                if (eleToFreq.containsKey(b)) { //if b is a key in hashmap, return true
                    return true;
                }
            }
            else if (A[i]==b) { //take eg k=22
                if (eleToFreq.get(A[i])>1) { //the freq=1, that means there might not be another same number to make it =k
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
