package prefix_sum;
//given an array, construct a prefix odd array

import java.lang.*;
import java.util.*;
public class ConstructPrefixOdd {
    static int[] prefixOdd(int[]A) {
        int N=A.length; //size of array A

        int[]sumodd=new int[N]; //declare an array which will contain sum of all odd indices
        sumodd[0]=0; //edge case

        for (int i=1; i<N; i++) {
            if (i%2!=0) {
                sumodd[i]=sumodd[i-1]+A[i];
            }
            else {
                sumodd[i]=sumodd[i-1];
            }
        }
        return sumodd;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        int[]output=prefixOdd(A);
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" ");
        }

    }

}
//TC is O(N) and SC is O(N)
