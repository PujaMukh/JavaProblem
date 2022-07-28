package extra_practise;

import java.util.Scanner;

//given 2 nos, find their GCD and print its factorial
public class GCDandFactorial {
    //eg 12, 20, o/p=24
    //gcd of 12 and 20 is 4, factorial of 4 is 24
    static int gcd(int a, int b) {
        if (a==0) {
            return b;
        }
        return gcd(b%a, a);
    }
    static int gcdFact(int A, int B) {
       int gcd=gcd(A,B);
       int i=gcd; //i=4
       int ans=1; //ans=1
       while (i>=1) {
           ans=ans*i; // ans=4
           i--;
       }
       return ans;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(gcdFact(A,B));


    }
}
