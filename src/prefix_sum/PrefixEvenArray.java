package prefix_sum;
//given an array, construct a prefix even array (sum of all even indices)

import java.lang.*;
import java.util.*;
public class PrefixEvenArray {
    static int[] prefixEven(int[]A) {
        int N=A.length; //size of array A
        int[]sumeven=new int[N]; //sumeven is the name of the prefix even array

        sumeven[0]=A[0]; //edge case

        for (int i=1; i<N; i++) {
            if (i%2==0) {
                sumeven[i]=sumeven[i-1]+A[i];
            }
            else {
                sumeven[i]=sumeven[i-1];
            }
        }
        return sumeven;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        int[]output=prefixEven(A);
                for (int i=0; i<N; i++) {
                    System.out.print(output[i]+" ");
                }

    }
}
//TC is O(N) and Sc is O(N) since we are creating a new sumeven array