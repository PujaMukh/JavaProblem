package BitManupulation;
//find xor of all elements in an array

import java.lang.*;
import java.util.*;
public class BitCompression {
    static int findBitCompression(int[]A) {
        int ans=0;
        int N=A.length;

        for (int i=0; i<N; i++) {
            ans=ans^ A[i];
        }
        return ans;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(findBitCompression(A));
    }
}
//TC is O(N), SC is O(1)
