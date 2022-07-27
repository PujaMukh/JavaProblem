package java_sample_oned_array;

import java.util.Scanner;

//given an array of integers, replace A[i] with A[A[i]] without using extra space
public class ReplaceAOfIWithAOfAOfi {
    //hint: to save the old value, mutiply each number with a number>=size of array
    //1) multiply each number with a no>=size of array

    static int[] replace(int[] A) {
        //1)
        for (int i=0; i<A.length; i++) { //eg 3 1 4 6 5 0 2, ans should be 6 1 5 2 0 3 4
            A[i]=A[i]*A.length; //3*7 1*7 4*7 6*7 5*7 0*7 2*7
        }
        for (int i=0; i<A.length; i++) {
            int idx=A[i]/A.length; //this will give me old value //3
            int val=A[idx]/A.length; //this will give val at A[A[i]]
            A[i]=A[i]+val; //doing + here to keep new value separate //3*7+6
        }
        //extract new value
        for (int i=0; i<A.length; i++) {
            A[i]=A[i]%A.length; //new val=x%n, old val=x/n
            //(3*7+6)%7=6
        }
        return A;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //input for size of array
        int[]A=new int[N]; //declare new input array
        for (int i=0; i<N; i++) { //take input for all elements in input array
            A[i]=sc.nextInt();
        }
        int[] output=replace(A);
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" ");
        }
    }
}
//TC is O(N), SC is O(1)