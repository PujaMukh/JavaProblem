package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class FindSecondLargest {
    //find 2nd largest in an array using one loop
    public static void main(String args[]) {
        int max= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array A

        int[] A=new int[N]; //declare an array A
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //input values in array A
        }

        if (N==1) {
            System.out.print("NA"); //size 1, return NA as there is no 2nd largest
        }
        else {
            for (int i = 0; i < N; i++) { //if size>1, enter loop to find 2ndlargest
                if (A[i] > max) { //if A[i] >max, max will become A[i]
                    max2 = max;
                    max = A[i];

                }
                else if (A[i] > max2) { //if A[i] is not greater than max, check if it is greater than max2
                    max2 = A[i]; //if it enters this loop, it means A[i] is less than max, so if it is greater than max2, A[i] is max 2 in this value of i
                }
            }
            System.out.print(max2); //print the 2nd max value
        }
    }
}
