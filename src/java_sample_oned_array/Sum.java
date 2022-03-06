package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class Sum {
    //return sum of all array elements
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take size of array N
        int sum=0; //initializing sum

        int[] A=new int[N]; //create new array A
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all array elements
        }

        for (int i=0; i<N; i++) { //for loop to get the result
            sum=sum+A[i];
        }
        System.out.print(sum); //print the result at the end
    }
}
