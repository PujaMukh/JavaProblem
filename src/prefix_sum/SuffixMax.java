package prefix_sum;

import java.util.Scanner;

//construct suffix max array
public class SuffixMax {
    static int[] findSuffixMax(int[] A) {
        int[] pfMax=new int[A.length];
        pfMax[A.length-1]=A[A.length-1];
        for (int i=A.length-2; i>=0; i--) {
            if (A[i]>pfMax[i+1]) {
                pfMax[i]=A[i];
            }
            else {
                pfMax[i]=pfMax[i+1];
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
        int[]output=findSuffixMax(A);
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" ");
        }

    }
}
//TC is O(N), SC is O(N) if considering o/p