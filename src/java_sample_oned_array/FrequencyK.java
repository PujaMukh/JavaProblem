package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class FrequencyK {
    //given an array A of size N, get frequency of K where K is given
    static int Frequency(int[] A,int K) { //creating a function and passing array A and int K
        int c=0;
        for (int i=0; i<A.length; i++) {
            if (K==A[i]) {
                c++;
            }
        }
        return c;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array A

        int[] A=new int[N]; //create blank array
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take inout for the array A
        }

        int K=sc.nextInt(); //take input for k

        System.out.print(Frequency(A,K));

    }

}
