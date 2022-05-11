package recursion;
import java.lang.*;
import java.util.*;
//keep on summing until the last result is 1 digit. If the ans=1, then return 1, else 0
public class MagicNumber {
    static int solve(int A) {
        //divisibility rule of 9 says a number is div by 9 if sum of digits also div by 9
        if (A%9==1) {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.println(solve(A));

    }
}
