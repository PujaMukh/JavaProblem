package recursion;
//given a, n and p, calculate (a^n)%p
import java.lang.*;
import java.util.*;
public class CalcAPowerNModP {
    static long powerMod(int a, int n, int p) {

        if (n==0) {
            return 1;    //when to break
        }
        long m=powerMod(a,n/2, p);
        if (n%2==0) { //2^10=2^5*2^5   //main logic
            return (m*m)%p;
        }
        else {
            return (a*(m*m)%p)%p;
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(powerMod(a,n,p));
    }
}
