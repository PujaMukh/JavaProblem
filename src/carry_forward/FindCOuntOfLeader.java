package carry_forward;
//given an array, find the count of number of leaders in the array
//an element is a leader if it is greater than all elements to its right
//an element on rightmost is always the leader

import java.lang.*;
import java.util.*;
public class FindCOuntOfLeader {
    static int findCount(int[]A) {
        //1st iterate and find max
        int N=A.length; //size of given array
        int count=1; //initializing it to 1 as ar[N-1] is always a leader
        int max=A[N-1]; //last element is always leader


        for (int i=N-2; i>=0; i--) {
            if (A[i]>max) {
                max=A[i];
                count++;
            }

    }
    return count;

    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare new array
        for (int i=0; i<N; i++) { //take input for all elements in array A
            A[i]=sc.nextInt();
        }
        System.out.print(findCount(A));
    }

}
//time complexity is O(N) and space complexity is O(1)
