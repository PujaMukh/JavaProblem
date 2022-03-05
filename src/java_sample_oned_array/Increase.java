package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class Increase {
    //given an array A, check if it is in increasing order or not
    static boolean IncK(int[] A) {

        for (int i=0; i<(A.length-2); i++) { //loop to check if any number is greater
            if (A[i] >= A[i + 1]) {
                    return false;
                }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt(); //take input for size of array

        int[] A=new int[N]; //create a new array A
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all array elements
        }

        System.out.print(IncK(A));
    }
}
