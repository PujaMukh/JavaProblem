package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class RemoveElement {
    //remove the element at Xth position and print the remaining array
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array

        int[] A=new int[N]; //declare an array A
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all array elements
        }

        int X=sc.nextInt(); //take input for X which is the index that needs to be removed from array

        int[] D=new int[N-1]; //create array D to store the output

        int temp=A[X-1]; //store the number to be deleted in temp

        for (int i=X-1; i<(N-1); i++) {
            A[i]=A[i+1]; //move elements
        }
        A[N-1]=temp; //store the element to be deleted at the last index

        for (int i=0; i<(N-1); i++) { //loop to assign array elements of A in D and print it
            D[i]=A[i];
            System.out.print(D[i]+" ");
        }

    }
}
