package java_sample_oned_array;
//find 2d largest element in an array

import java.lang.*;
import java.util.*;
public class Find2ndLargest {
    static int secondLargest(int[]A) {
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        int N=A.length; //size of array

        if (N==1) {
            return 0; //edge case for array of size 1
        }
        for (int i=0; i<N; i++) {
            if (A[i]>largest) {
                second_largest=largest;
                largest=A[i];
            }
            else if (A[i]>second_largest) {
                second_largest=A[i];
            }
        }
        return second_largest;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        System.out.print(secondLargest(A));
    }

}
