package java_very_simpleproblems;
//Given an integer A, determine whether it is palindromic or not.
import java.lang.*;
import java.util.*;
public class CheckIfPalindrome {
    static int palindromeNumber(int A) {
        //I will use formula num=num*10+d to reverse the number (base 10)
        int temp=A; //preserving the A in temp for later
        int rev=0;
        while(temp>0) {
            int d=temp%10;
            rev=rev*10+d;
            temp=temp/10;
        }

        if (rev==A) {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(palindromeNumber(A));
    }
}
