package sorting;
//given an array which contains only 0,1 and 2, sort without uisng any library functions

//move all 0's to front
//move all 2's to back
//edge case: if length=1, return A
//keep 3 indexes start, end, current
//nothing should be done with 1's (it will fall in place)

import java.lang.*;
import java.util.*;
public class SortByColor {
    static int[] sortByColor(int[]A) {
        int N=A.length;

        if (N==1) {
            return A; //edge case
        }

        int start=0;
        int end=N-1;
        int current=0;

        while (current<=end) {

            if (A[current]==0) {
                //swap
                //start will sit where next 0 should go
                A[current]=A[start]; //so that space is freed for 0 to be there in start
                A[start]=0;
                start++;
                current++;
            }

            else if(A[current]==2) {
                //swap
                //end will sit where next 2 should go
                //now 2 will go where end is there, so we have to free 2
                A[current]=A[end];
                A[end]=2;
                end--;
            }
            else {
                current++;
            }
        }
        return A;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int[]output=sortByColor(A);
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" ");
        }
    }

}
//TC is O(N), SC is O(1)
