package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class AddArray {
    //return an array which is the sum of A[i] and B
    static int[] AddToArray (int[]A, int B) {
        int[] D=new int[A.length]; //create new array for the output

        for (int i=0; i<A.length; i++) {
            int c=0;
            c=A[i]+B;
            D[i]=c;
        }
        return D; //returning the array with the final result
    }
    public static void main(String args[])  {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt(); //take input for size of array

        int[] A=new int[N]; //create an array A
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take inputs for the array A
        }
        int B=sc.nextInt(); //taking input for B
        int[] temp = AddToArray(A,B); //creating an array to call the function
        for (int i=0; i<N; i++) {
            System.out.print(temp[i]+" "); //iterating on the array to print the array
        }
    }
}
