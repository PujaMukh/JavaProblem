package recursion;
//now find power of a^n by following the fact that 2^10=2^5*2^5 and 2^11=2^5*2^5*2
import java.lang.*;
import java.util.*;

public class APowerNAnotherWay {
    static int findPow(int a, int n) { //find a^n
        if (n==0) {
            return 1;
        }
        int p=findPow(a, n/2);
        if (n%2==0) { //2^10=25*2^5
            return p*p;
        }
        else {
            return a*p*p; //2^11=2*2^5*2^5
        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(findPow(a, n));
    }
}
