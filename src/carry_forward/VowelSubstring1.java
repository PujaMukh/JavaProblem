package carry_forward;
//given a string, find count of all the substrings which starts with a vowel
//another way to solve the same question we did before
//put all the vowels in a string and see if the char in input string is present in vowel string
//if not present, c++
//if present, c++ and ans=ans+count

import java.lang.*;
import java.util.*;

public class VowelSubstring1 {
    static boolean isPresent(String A, char c) {
        int N=A.length();
        for (int i=0; i<N; i++) {
            if (A.charAt(i)==c) {
                return true;
            }
        }
        return false;
    }
    static int vowel(String A) {
        int N=A.length(); //length of input string A

        String S=new String(); //make a string to store all vowels
        S="aeiouAEIOU";

        //traverse from back
        //when it is not vowel, c++;
        //when we hit a vowel, c++ and ans=ans+c

        int count=0;
        int ans=0;

        for (int i=N-1; i>=0; i--) {
            if (isPresent(S,A.charAt(i))==false) {
                count++;
            }
            else {
                count++;
                ans=ans+count;
            }
        }
        return ans%10003;


    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.print(vowel(A));
    }
}
//TC is O(N), SC is O(1)