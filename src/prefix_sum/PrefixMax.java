package prefix_sum;

import java.util.Scanner;

//given an array, construct prefix max array
public class PrefixMax {
    //eg 1 -6 3 2 8 7, ans= 1 1 3 3 8 8
    static int[] findPfMax(int[] A) {
        int[] pfMax=new int[A.length];
        pfMax[0]=A[0];
        for (int i=1; i<A.length; i++) {
            if (pfMax[i-1]>A[i]) {
                pfMax[i]=pfMax[i-1];
            }
            else {
                pfMax[i]=A[i];
            }
        }
        return pfMax;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        int[]output=findPfMax(A);
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" ");
        }

    }

}
//TC is O(N), SC is O(N)