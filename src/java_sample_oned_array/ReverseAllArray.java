package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class ReverseAllArray {
    //reverse all elements in the array
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take size of array N

        int[] arr=new int[N]; //declare an array
        for (int i=0; i<N; i++) {
            arr[i]=sc.nextInt();   //input elements in the new array
        }

        for (int i=0; i<N/2; i++) { //for loop to swap elements in order to reverse the array
            int temp=arr[N-1-i];
            arr[N-1-i]=arr[i];
            arr[i]=temp;
        }
        for(int i=0; i<N; i++) {         //for loop to print all reversed array elements
            System.out.print(arr[i]);
        }
    }
}
