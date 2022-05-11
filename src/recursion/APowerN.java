package recursion;
//find a^n using recursion
import java.lang.*;
import java.util.*;

public class APowerN {
    static int findPow(int a, int n) {

        if (n==0) {     //when to break
            return 1;
        }
        return a* findPow(a,n-1);   //main logic by breaking into smaller problems
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(findPow(a,n));
    }
}
