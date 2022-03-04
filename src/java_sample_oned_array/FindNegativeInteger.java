package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class FindNegativeInteger {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take the size of array N

        int[] arr=new int[N];    //declare an array
        for (int i=0; i<N; i++) {
           arr[i]=sc.nextInt(); //take input in array N
        }

        int NegInteger=0; //initialize the integer which will print the result
        for (int i=0; i<N; i++) {
            if (arr[i]<0) {      //condition
                NegInteger=arr[i];
                System.out.print(NegInteger); //print if condition is satisfied
            }
        }
    }
}
