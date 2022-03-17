package java_sample_oned_array;
//Write a program to input N numbers from user and print the count of all the super maximas among them.
//NOTE: An element is super maxima if there exist atleast one element before it
// and atleast one element after it and following conditions are satisfied:
//A[i-1] < A[i] > A[i+1]
//A[i-1] + A[i+1] < A[i]
//Sample Input:
// 5
// 2 3 1 4 2
//Sample Output:
// 1
//Explanation:
// Only 4 satisfies all the conditions, i.e. 4>1, 4>2 and 4>1+2.

import java.lang.*;
import java.util.*;
public class SuperMaxima {
    static int findSuperMaxima(int[]A)   {
        int N=A.length; //length of array A

        //loop from 1 to last to last index as we have to ignore the 1st and last index based on constraints
             int c=0; //initializing to store the count
        for(int i=1; i<N-1; i++){
            if ((A[i-1]<A[i] && A[i]>A[i+1]) && (A[i-1]+A[i+1]<A[i]))  {
                 c++;
            }
        }
         return c;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array

        int[]A=new int[N];     //declare blank array of size N
        for (int i=0; i<N; i++)    {
            A[i]= sc.nextInt(); //take input for all elements of array A
        }
        System.out.print(findSuperMaxima(A));

    }
}
