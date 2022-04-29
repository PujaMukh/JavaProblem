package sorting;
//given an array, return 1 if the difference between any 2 consequetive elements is same, else 0


import java.lang.*;
import java.util.*;
public class ArithmaticProgression {
    static int findIfArithmaticProgression(int[]A) {
        int N=A.length;
        //hint: sort 1st
        Arrays.sort(A);

        if (N==1 || N==2) {
            return 1;
        }
        int diff=A[1]-A[0];

        for (int i=2; i<N; i++) {
            if (A[i]-A[i-1]!=diff) {
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
