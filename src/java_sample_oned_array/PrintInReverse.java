package java_sample_oned_array;
//print the array in reverse

import java.lang.*;
import java.util.*;
public class PrintInReverse {
    static int[] revPrint(int[]A) {
        int N=A.length; //size of array A
        for (int i=0; i<N/2; i++) {
            int temp=A[N-1-i];
            A[N-1-i]=A[i];
            A[i]=temp;
        }
        return A;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare new array
        for (int i=0; i<N; i++) { //take input for all elements in array
            A[i]=sc.nextInt();
        }
        //since the above function returned an array we have to store it 1st in an array
        int[]output=revPrint(A);
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" "); //now print all
        }

    }
}
