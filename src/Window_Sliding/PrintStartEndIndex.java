package Window_Sliding;
//print start and end index of all subarrays of size k

import java.lang.*;
import java.util.*;
//window sliding approach- 1) keep a start and end index
//2) logic in for or while loop
//increment until we reach end

public class PrintStartEndIndex {
    static void startEnd(int[]A, int k) {
        int N=A.length;

        int s=0;
        int e=k-1;

        while (e<N) {

            System.out.println(s+" "+e);
            s++;
            e++;
        }
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        startEnd(A,k);
    }
}
//TC is O(N), SC is O(1)
