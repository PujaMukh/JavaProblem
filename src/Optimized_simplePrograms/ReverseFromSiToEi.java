package Optimized_simplePrograms;
//given an array, reverse from a particular index to another index
//si is the "from" index and ei is the "to" index

import java.lang.*;
import java.util.*;
public class ReverseFromSiToEi {
    //this is very similar to the last problem we did for reversing entire array
    //for reversing entire array we start from 0 to N/2-1 (length/2)
    //here we will start from Si and go uptil (ei-si)/2 (length to reverse/2)
    static void rev(int[]A, int Si, int Ei) {
        int N=A.length; //length of array A
        for (int i=Si; i<=(Ei-Si)/2; i++) { //looping just like we did while reversing entire array
            int temp=A[Ei];
            A[Ei]=A[Si];
            A[Si]=temp;
        }
        for (int i=0; i<N; i++) { //printing the array
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //size of array
        int[]A=new int[N]; //declare new array
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all elements in array A
        }
        int Si=sc.nextInt();
        int Ei=sc.nextInt();
       rev(A,Si,Ei);
    }

}
//Time complexity is O(N) and space complexity is O(1)
//O(N) as worst case is si=0, ei=N