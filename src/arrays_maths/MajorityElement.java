package arrays_maths;
//find majority element in an array using moore's voting algorithm
//element is majority when freq of that element is >N/2
//1) traverse and find the majority element using moore's algorithm
//2) traverse again and check if that element freq>N/2

import java.lang.*;
import java.util.*;

public class MajorityElement {
    static int findMajorityElement(int[]A) {
        int N=A.length;
        int ele=A[0];
        int freq=1;
        int count=0;
        //to find majority element
        for (int i=1; i<N; i++) {

            if (freq==0) {
                ele=A[i];
                freq=1;
            }

            else if (A[i]==ele) {
                freq++;
            }

            else {
                freq--;
            }
        }
        //now check if it is actually a majority element

        for (int i=0; i<N; i++) {
            if (A[i]==ele) {
                count++;
            }
        }
        if (count>N/2) {
            return ele;
        }
        return -1; //no majority element

    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(findMajorityElement(A));

    }

}
//TC is O(N), SC is O(1)
