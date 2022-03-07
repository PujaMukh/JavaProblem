package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class RotateBtimes {
    //rotate the array B times
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take size of array N

        int[] A=new int[N]; //create an array with size M
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input in array A
        }

        int B=sc.nextInt(); //take input for B which is the no of times array will be rotated

        if (N==B) {                //if B is equal to size of array, no need to rotate array even once
            for (int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
        }
            else if (B%N==0) { //if it is multiples of B, array will remain same
                for (int i=0; i<N; i++) {
                    System.out.print(A[i] + " ");
                }
            }

       else {      //if B!=N, enter this loop and rotate array B times
            for (int i=0; i<(B%N); i++) {  //loop to rotate the array B times (added worst case time complexity)
                int temp=A[N-1];     //put the last element in a variable temp
                for (int j=N-2; j>=0;j--) { //loop to move elements to the right
                    A[j+1]=A[j];
                }
                A[0]=temp; //put the tep value in 0th index
            }

            for (int i=0; i<N; i++) { //loop to print B times rotated array
                System.out.print(A[i]+" ");
            }
        }
    }
}
