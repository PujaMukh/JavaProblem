package java_sample_oned_array;

import java.util.Scanner;

//given an array, check if there exists a subsequence with gcd=1
//hint: if gcd of entire array is 1, there exists a subsequence with gcd=1
public class CheckIfSubsequenceWithGCD1 {
    //same as question gcd of entire array
    static int gcd(int a, int b) {
        if (a==0) {
            return b;
        }
        return gcd(b%a, a);
        //a=b%a in division method
        //b=a in div method in gcd
    }
    static boolean checkIf(int[] A) {
        int ans=A[0];
        for (int i=1; i<A.length; i++) {

            if (A[i]<0) {
                A[i]=-1*A[i]; //to take the mod of A[i] if -ve
                //we dont care for -ve nos
            }

            ans=gcd(ans, A[i]);


        }
        if (ans==1) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int [N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(checkIf(A));
    }
}
//TC is O(log 2 base N)