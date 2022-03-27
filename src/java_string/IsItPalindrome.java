package java_string;
//return 1 if the given string is a palindrome
import java.lang.*;
import java.util.*;
public class IsItPalindrome {
    static int palindrome(String A) {
        int N=A.length(); //length of string A
        int i=0;
        int j=N-1;
        while(i<j) { //only run the loop until middle
            if (A.charAt(i)==A.charAt(j)) {
                i++;
                j--;
            }
            else {
                return 0; //if we get a character which isnt equal, return 0
            }
            break;
        }
        return 1; //if loop ends and we dont get a 0, return 1
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string A
        System.out.print(palindrome(A));
    }

}
