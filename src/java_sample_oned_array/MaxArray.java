package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class MaxArray {
    //find the max element in an array
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input N

        int[] arr=new int[N]; //declare and initialize array and declare size of array N
        int max=arr[0]; //initialize max element to array index 0

        for (int i=0; i<N; i++) {
            arr[i]=sc.nextInt(); //traverse all elements in array
            if (arr[i]>max) { //condition
                max=arr[i];
            }
        }
        System.out.print(max); //result
    }
}
