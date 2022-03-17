package java_sample_oned_array;
//Given an array containing duplicate numbers and a target value,
// find the index of 2nd occurence of the target value
//Sample Input:
//6
//9 2 8 2 4 2
//2
//Sample Output:
//3
//Explanation
//Here target=2 There are 3 occurences of 2 in the given array. The 2nd occurence is found at index=3.

import java.lang.*;
import java.util.*;

public class LinearSearch {
    static int findIndex(int[] A, int B) {
        int N=A.length; //size of array A

        int c=0;
        for (int i=0; i<N; i++) {
            if (A[i]==B) {
                c++;
            }
            if (c==2) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[] A=new int[N]; //declare a blank array A with size N
        //now take input for all elements in A

        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        int B=sc.nextInt(); //input for target value

        System.out.print(findIndex(A,B));
    }

}
