package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class DiffK {
    //given array A, check if difference between any 2 adjacent elements is K where K is given
    static boolean DifK(int[] A, int K) {
        int diff=0; //initialize variable diff

        for (int i=0; i<(A.length-2); i++) { //loop to check if difference between adjacent elements is K
            diff=A[i]- A[i+1];
            if (diff==K) {
                return true;
            }
        }
        return false; //if loop fails, return false

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt(); //take input for size of array A

        int[] A=new int[N]; //declare a blank array
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //input values for all elements in array A
        }

        int K=sc.nextInt(); //take input for K

        System.out.print(DifK(A,K)); //result
    }

}
