package hashing;

import java.lang.*;
import java.util.*;

//find the 1st non repeating ele in the array
public class FstNonRepeatingEle {
    static int findFirstNonRepeatingElement(int[]A) {
        int N=A.length; ///size of given array
        HashMap<Integer, Integer>eleToFreq=new HashMap<>(); //declare a hashmap which will contain the element which is key and the freq of each element which is value

        for (int i=0; i<N; i++) {
            //1st check if the key is already there in hashmap. If there find the key value and update
            //if not there add the key and its value
            if (eleToFreq.containsKey(A[i])) { //if key is there.....
                int val=eleToFreq.get(A[i]); //get the value of that key
                eleToFreq.put(A[i], val+1); //update the key with value+1;
            }
            else { //if not there, add the key with value
                eleToFreq.put(A[i], 1);
            }
        }
        //now iterate through original array and check which 1st element has freq 1 in hashmap and return
        for (int i=0; i<N; i++) {
            if (eleToFreq.get(A[i])==1) {
                return A[i];
            }
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
        System.out.println(findFirstNonRepeatingElement(A));
    }
}
//TC is O(N), SC is O(N)
