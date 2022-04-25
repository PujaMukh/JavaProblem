package ModularArithmatic;
//givan a, n and p, calculate a^n%p (consider overflow)

import java.lang.*;
import java.util.*;
public class PowMod {
    static long findPowMod(int n, int a, int p) {

        long pow=1;
        for (int i=1; i<n; i++) {
            pow=(pow%p*a%p)%p; //mod p at every step to avoid overflow,
            //or else t can just be pow=pow*a
        }
        return pow%p;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();

        System.out.println(findPowMod(n,a,p));
    }
}
//TC is O(N), SC is O(1)
