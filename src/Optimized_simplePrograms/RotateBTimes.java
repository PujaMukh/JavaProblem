package Optimized_simplePrograms;
//given an array rotate it B times
//1st method is O(N^2)

import java.lang.*;
import java.util.*;
public class RotateBTimes {
    static int[] rotate(int[]A, int B) {
        int N=A.length; //size of array A
        if (B%N==0) {
            return A; //if B is multiples of N, the array will remain same
        }
        else {
            for (int i=0; i<B%N; i++) { //if not multiple, we only need to rotate B%N times
                int temp=A[N-1];
                for (int j=N-2; j>=0; j--) {
                    A[j+1]=A[j];
                }
                A[0]=temp;
            }
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
//TC is O(N^2) and SC is O(1)