package java_sample_oned_array;
import java.lang.*;
import java.util.*;
//Given array A of size N, insert Y at position X and return the resulting array
public class InsertElement {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt(); //take input for size of array

        int[]A=new int[N]; //create a blank input array A
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all elements in array A
        }

        int X=sc.nextInt(); //take input for the position where Y will be inserted

        int Y=sc.nextInt(); //take input for integer Y which has to be inserted in position X

        int[]B=new int[N+1]; //declare blank array B for output whose size will be N+1

        for (int i=0; i<N;i++) {  //copy all elements of A in output array B
            B[i]=A[i];
        }

        for (int i=N-1; i>X-2; i--) {
            B[i+1]=B[i];
        }
        B[X-1]=Y;

        for (int i=0; i<N+1; i++) {
            System.out.print(B[i]+" ");
        }
    }
}

