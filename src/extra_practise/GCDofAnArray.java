package extra_practise;

import java.util.Scanner;

//given N nos in an array, print and find their gcd
public class GCDofAnArray {
    //20 40 100 55 35
    //o/p=5

    static int gcd(int a, int b) {
        if (a==0) {
            return b;
        }
        return gcd(b%a, a);
    }
    static int gcdOfAnArray(int[] A) {
        int ans=A[0];

        for (int i=1; i<A.length; i++) {
            ans=gcd(ans, A[i]);

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(gcdOfAnArray(A));


    }
}
