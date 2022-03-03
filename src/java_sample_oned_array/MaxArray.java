package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class MaxArray {
    //find the min element in an array
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input N

        int[] arr=new int[N]; //declare array of size N
        int max=Integer.MIN_VALUE; //initialize max

        for (int i=0; i<N; i++) {
            arr[i]=sc.nextInt(); //initialize all elements in array
            if (arr[i]>max) { //condition
                max=arr[i];
            }
        }
        System.out.print(max); //result
    }
}
