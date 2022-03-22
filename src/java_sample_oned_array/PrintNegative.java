package java_sample_oned_array;
//given array, print all negative numbers
import java.lang.*;
import java.util.*;
public class PrintNegative {
    static ArrayList<Integer> printAllNegative(int[]A) {
        int N=A.length; //size of input array A
        ArrayList<Integer>output=new ArrayList<Integer>(); //make new arraylist to store output
        for (int i=0; i<N; i++) {
            if (A[i]<0) {
                output.add(A[i]);
            }
        }
        return output;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array A
        int[]A=new int[N]; //declare new array A
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        //now since the above function is returning an arraylist, store it in an arraylist
        ArrayList<Integer>output1=new ArrayList<Integer>();
        output1=printAllNegative(A); //store the above function in an arraylist
        int M=output1.size(); //size of this arraylist which has all output elements

        for (int i=0; i<M; i++) {
            System.out.print(output1.get(i)+" "); //print it
        }
    }

}
