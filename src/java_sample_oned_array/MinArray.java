package java_sample_oned_array;

import java.lang.*;
import java.util.*;

public class MinArray {
    //find the min element in an array
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //take input N

        int[] arr = new int[N]; //declare array of size N
        int min =Integer.MAX_VALUE; //initialize min

        for (int i=0; i < N; i++) {
            arr[i] = sc.nextInt(); //initialize array
            if (arr[i] < min) { //condition
                min = arr[i];
            }
        }

        System.out.print(min); //result
    }
}
