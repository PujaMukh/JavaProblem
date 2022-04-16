package LeetcodeProblems;
//question no 9
//hint: all negative numbers are not palindrome
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        //without converting to a string, if I reverse the number and if it is same as   //original, then true, else false
        //edge case- when x==0
        //tip:if x<0, it will never be a palindrome, so always return falde


        long temp=(long)x; //so original x value is preserved
        long rev=0;

        while (temp>0) {
            long d=temp%10;
            rev=rev*10+d;
            temp=temp/10;
        }


        if ((long)x==rev && (long)x>=0) {
            return true;
        }
        return false;
    }
}
//TC is O(log n), SC is O(1)
