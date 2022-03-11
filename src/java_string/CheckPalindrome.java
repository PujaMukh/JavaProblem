package java_string;
//given a string, check if it is palindrome or not
//a string with 1 letter is by default a palindrome

import java.lang.*;
import java.util.*;

public class CheckPalindrome {
    static boolean CheckIfPalindrome(String s) { //here return type is boolean(true/false)
        int l = s.length(); //take length of string

        int i = 0; //initialize starting point in string s
        int j = l - 1; //another starting point in string s
        //now we have to check if starting=end. If yes, increase starting by 1 and decrease end by 1 to check whole string

        while (i < j) {//continue the loop only till i<j where i is starting point and j is end point
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false;
            }
            break;
        }
        return true; //return true if whole loop ends and we dont get false
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(CheckIfPalindrome(s));
    }
}

