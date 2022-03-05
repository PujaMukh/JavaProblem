package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class Unique {
    //given N array elements where every element is repeating twice except 1 element, find that element
    static int UniqueElement(int[]A) {
        int f=0; //initializing integer f
        int i=0;

        for (i=0; i<A.length; i++) {
            f=0;
            for (int j=0; j<A.length; j++) {
                if (A[i]==A[j]) {
                    f++;
                }
            }
            if (f==1) {
                return A[i];
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //input for size of array

        int[] A=new int[N]; //create an array A
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //taking input for all array elements
        }
        System.out.print(UniqueElement(A));
    }
}
