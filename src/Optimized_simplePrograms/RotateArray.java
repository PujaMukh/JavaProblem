package Optimized_simplePrograms;
//reverse array by using another array

import java.lang.*;
import java.util.*;
public class RotateArray {
    static int[] rotate(ArrayList<Integer>A) {
        int N=A.size(); //size of arraylist
        //make another array to store the output, size will be same
        int[]output=new int[N];
        int j=0;
        for (int i=N-1; i>=0; i--) {
            output[j]=A.get(i);  //loop to add elements in new array from last
            j++;
        }
        return output;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //size of input arraylist
        ArrayList<Integer>A=new ArrayList<Integer>(); //declare an arraylist
        for (int i=0; i<N; i++) {
            A.add(sc.nextInt()); //take input for all elements in arraylist
        }
        int[] B=rotate(A); //since above function is returning an array, store it in an array
       for (int i=0; i<N; i++) {
           System.out.print(B[i]+" ");
       }
    }
}
