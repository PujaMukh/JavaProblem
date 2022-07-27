package java_sample_oned_array;

import java.util.Scanner;

//given an array, delete an ele from the array such that GCD of remaining ele is max
public class Delete1EleGCDmax {
    //hint: 1)make gcdprefix from front
    //2)make gcdsuffix from back
    //3)delete every ele virtually and calculate

    static int gcd(int a, int b) {
        if (a==0) {
            return b;
        }
        return gcd(b%a, a); //applying the division method we learnt in school,
        //b becomes a after division
        //a=b%a, b=a
    }

    static int findMaxGCD(int[] A) {
        //1)
        int[] pfGCD=new int[A.length];
        pfGCD[0]=A[0];
        for (int i=1; i<A.length; i++) {
            pfGCD[i]=gcd(pfGCD[i-1], A[i]);
        }

        //2)
        int[] sfGCD=new int[A.length];
        sfGCD[A.length-1]=A[A.length-1];

        for (int i=A.length-2; i>=0; i--) {
            sfGCD[i]=gcd(sfGCD[i+1], A[i]);
        }

        //3) delete every ele virtually
        int ans=Integer.MIN_VALUE;
        int leftGCD=0;
        int rightGCD=0;

        for (int i=0; i<A.length; i++) {
            //deleting ith ele virtually

            if (i==0) {
                leftGCD=0;
            }
            else {
                leftGCD=pfGCD[i-1];
            }
            if (i==A.length-1) {
                rightGCD=0;
            }
            else {
                rightGCD=sfGCD[i+1];

            }



            int gcdExceptIthEle=gcd(leftGCD, rightGCD);
            ans=Math.max(ans, gcdExceptIthEle);
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
        System.out.println(findMaxGCD(A));
    }
}
