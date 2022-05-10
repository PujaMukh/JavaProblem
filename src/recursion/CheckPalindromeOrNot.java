package recursion;
//given a string, check if it is palindrome or not
import java.lang.*;
import java.util.*;

public class CheckPalindromeOrNot {
    static int solve(String A) {
        int N=A.length();
        return checkPalindrome(A,0, N-1);

    }
    //have a base condition, main logic and termination condition if not equal in between
    static int checkPalindrome(String A, int s, int e) {
        int N=A.length();

        //base condition (or when to stop finally)
        if (s>=e) {
            return 1;

        }
        //termination in between condition
        if (A.charAt(s)!=A.charAt(e)) {
            return 0;
        }
        //main logic
        return checkPalindrome(A, s+1, e-1);

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(solve(A));
    }
}
