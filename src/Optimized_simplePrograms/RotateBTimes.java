package Optimized_simplePrograms;
//given an array rotate it B times
//now do it using Time complexity O(N)
//1st reverse full array once
//then reverse/swap 1st half until B-1 index
//then reverse/swap 2nd half from B index to N-1

import java.lang.*;
import java.util.*;
public class RotateBTimes {
    static int[] rotate(int[]A, int B) {
        int N=A.length; //size of array A

        //1st reverse full array
        for (int i=0; i<N/2; i++) {
            int temp=A[N-1-i];
            A[N-1-i]=A[i];
            A[i]=temp;
        }

       //now swap/reverse elements from 0th index to B-1 index
        //in reverse we start loop from 0 to N/2
        //here from 0 to B-1
        for (int j=0; j<B/2; j++) {  //loop to reverse 1st part
            int temp1=A[B-1-j];
            A[B-1-j]=A[j];
            A[j]=temp1;
        }

        for (int k=0; k<(N-B)/2; k++) { //loop to reverse last part
            int temp2=A[N-1-k];
            A[N-1-k]=A[B+k];
            A[B+k]=temp2;
        }
        return A;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare new array A
        for (int i=0; i<N; i++) { //take input for all elements in array A
            A[i]=sc.nextInt();
        }
        int B=sc.nextInt(); //take input for int B
        int[]output=rotate(A,B); //store the above function in a new array since the above function is returning an array
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" "); //print one by one
        }
    }
}
//TC is O(N) and SC is O(1)