package hashing;
//find the 1st repeating element in an array
import java.lang.*;
import java.util.*;
public class FstRepeatingEle {
    static int findFirstRepeatingEle(int[]A) {
        //same as non repeating element question
        int N=A.length;
        HashMap<Integer,Integer>eleToFreq=new HashMap<>(); //declare

        for (int i=0; i<N; i++) {
            if (eleToFreq.containsKey(A[i])) { //if key is there
                int val=eleToFreq.get(A[i]); //find value
                eleToFreq.put(A[i], val+1); //update value
            }
            else { //if not there
                eleToFreq.put(A[i],1); //add 1 to hashmap

            }
        }

        //now iterate through original array and find the 1st element with freq>1
        for (int i=0; i<N; i++) {
            if (eleToFreq.get(A[i])>1) {
                return A[i];
            }
        }
        return -1;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(findFirstRepeatingEle(A));
    }

}
//TC is O(N), SC is O(N)
