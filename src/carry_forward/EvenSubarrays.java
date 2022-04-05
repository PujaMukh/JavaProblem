package carry_forward;
//check whether it is possible to divide given array into one or more subarrays where:
//length of all subarrays even and 1st and last element of all subarrays even

import java.lang.*;
import java.util.*;
public class EvenSubarrays {
    static int subArrays(int[]A) {
        int N=A.length; //size of array

        if (N%2!=0) {
            return 0;
        }
        else if (A[0]%2==0 && A[N-1]%2==0) {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //size of array
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //input for all array elements
        }
        System.out.print(subArrays(A));
    }
}
//SC is O(1) and TC is O(1)
