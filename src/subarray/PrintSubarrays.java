package subarray;
//print all subarrays of a given array

import java.lang.*;
import java.util.*;
public class PrintSubarrays {
    //it will be N^3 time complexity as we have to print all elements
    static void printAllSubArrays(int[]A) {
        int N=A.length; //size of array A

        for (int i=0; i<N; i++) { //start index loop
            for (int j=i; j<N; j++) { //end index loop
                for (int k=i; k<=j; k++) { //for printing
                    System.out.print(A[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
       printAllSubArrays(A);
    }
}

//TC is O(N^3) and SC is O(1)
