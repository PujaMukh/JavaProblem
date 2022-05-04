package hashing;

import java.lang.*;
import java.util.*;

//check if all elements are distinct or not
public class AllElementsDistinct {
    static boolean checkIfAllElementsDistinct(int[]A) {
        //hint: check if size of hashset=size of array
        int N=A.length; //length of original array
        HashSet<Integer>ele=new HashSet<>(); //declare

        for (int i=0; i<N; i++) {
            ele.add(A[i]); //add all elements to hashset
        }
        int M=ele.size();
        if (N==M) {
            return true;
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
        System.out.println(checkIfAllElementsDistinct(A));
    }
}
//TC is O(N), SC is O(N)
