package java_sample_oned_array;
//given an array A and an integer B, return the count of pairs having sum equal to B

import java.lang.*;
import java.util.*;
public class PairCount {
    static int countThePairs(int[]A, int B) {
        int N=A.length;
        int c=0;
        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                if (A[i]+A[j]==B) {
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int []A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        int B=sc.nextInt();
        System.out.print(countThePairs(A, B));
    }
}
