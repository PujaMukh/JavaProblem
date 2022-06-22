package sorting;
//given an array, return 1 if the difference between any 2 consequetive elements is same, else 0


import java.lang.*;
import java.util.*;
public class ArithmaticProgression {
    static int findIfArithmaticProgression(int[]A) {
        int N=A.length;
        //hint: sort 1st
        Arrays.sort(A);

        if (N==1) {
            return 1;
        }
        int diff=Math.abs(A[0]-A[1]); //considering negative ele as well //eg -2, -4,-6

        for (int i=1; i<N-1; i++) {
            if (Math.abs(A[i]-A[i+1])!=diff) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(findIfArithmaticProgression(A));
    }
}
//TC is O(nlogn), SC is O(1)
