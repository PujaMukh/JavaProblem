package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class Pair {
    //return count of pairs in array A having sum=B where B is given (i!=j and i,j and j,i pairs are same)
    static int pairCount(int[] A, int B) {
        int N=A.length;
        int c=0; //initialize count variable
        for (int i=0; i<(N-1); i++) {
            for (int j=i+1; j<N; j++) { //for loops to avoid same pairs,example i,j and j,i are same
                if (A[i]+A[j]==B) {
                    c++;
                }
            }
        }
        return c; //return the final count
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take size of array N

        int[] A=new int[N]; //declare array A
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt(); //take input for all elements of array A
        }

        int B=sc.nextInt(); //take input B

        System.out.print(pairCount(A,B));
    }
}
