package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class RotateOnce {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input N

        int[] arr=new int[N]; //declare new array of size N
        for (int i=0; i<N; i++) {
            arr[i]=sc.nextInt(); //take array inputs
        }
        int temp=arr[N-1]; //store the last element in temp variable

        for (int i=N-2; i>=0; i--) {
            arr[i + 1] = arr[i];     //keep moving elements to the right side
        }
            arr[0]=temp; //now store the value in temp in 0th index

        for (int i=0; i<N; i++) {
            System.out.print(arr[i]); //print the rotated array
        }
    }
}
