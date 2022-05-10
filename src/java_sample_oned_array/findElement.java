package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class findElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for (int i=0; i<T; i++) {
            int N=sc.nextInt();
            int[] A=new int[N]; //create a blank array A

            for (i=0; i<N; i++) {
                A[i]=sc.nextInt(); //input elements in array A
            }

            int B=sc.nextInt(); //take input for B;


            for (i=0; i<N; i++) {
                if (B==A[i]) {
                    System.out.print("1");
                    break;
                }
            }
            System.out.print("0");
        }
    }
}