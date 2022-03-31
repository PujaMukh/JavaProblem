package java_sample_oned_array;
//given an array, return 2 separate arrays containing odd and even

import java.lang.*;
import java.util.*;
public class SeparateOddAndEven {
    static void oddEven(int[]A) {
        int N=A.length; //size of array
        //now make 2 arraylists to store odd and even
        ArrayList<Integer>odd=new ArrayList<Integer>(); //new arraylist for odd
        ArrayList<Integer>even=new ArrayList<Integer>(); //new arraylist for even

        for (int i=0; i<N; i++) { //loop for logic
            if (A[i]%2!=0) {
                odd.add(A[i]);
            }
            else {
                even.add(A[i]);
            }
        }
        int P=odd.size(); //size of odd arraylist
        int Q=even.size(); //size of even arraylist
       for (int i=0; i<P; i++) { //now print odd
           System.out.print(odd.get(i)+" ");
       }
        System.out.println(); //next line
        for (int i=0; i<Q; i++) { //print even
            System.out.print(even.get(i)+" ");
        }

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //input for size of array
        int[]A=new int[N]; //declare new input array
        for (int i=0; i<N; i++) { //take input for all elements in input array
            A[i]=sc.nextInt();
        }
       oddEven(A); //just call the above function since we already printed it in above function
    }
}
//Time complexity is O(N)  , space complexity is O(N^2)
