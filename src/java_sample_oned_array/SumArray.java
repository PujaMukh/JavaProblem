package java_sample_oned_array;

import java.lang.*;
import java.util.*;

public class SumArray {
    //find sum of all elements in an array
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        int sum=0;

        for (int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.print(sum);

    }
}
