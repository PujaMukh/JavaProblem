package arrays_maths;

import java.util.ArrayList;
import java.util.Scanner;

//calculate gcd of entire array
public class CalculateGCDofEntireArray {
    static int gcd(int a, int b) {
        if (a==0) {
            return b;
        }
        return gcd(b%a, a); //applying the division method we learnt in school,
        //b becomes a after division
        //a=b%a, b=a
    }
    static int gcdArray(int[] A) { //eg 6 12 15
        int ans=A[0];
        for (int i=1; i<A.length; i++) {

            if(A[i]<0) {  //take the mod if it is negative
                A[i]=-1*A[i];
            }

            ans=gcd(ans, A[i]);
        }
        return ans;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int [N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(gcdArray(A));
    }
}
//TC is O(N log 2 base N), SC is O(1) if not considering o/p