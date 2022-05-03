package strings;
//find the number of amazing substrings that start with a vowel
//hint: start from last and keep a count
//whenever you get a vowel, do ans=ans+count

import java.lang.*;
import java.util.*;
public class AmazingSubarray {
    static boolean isPresent(String S, char c) {
        int N=S.length();

        for (int i=0; i<N; i++) {
            if (S.charAt(i)==c) {
                return true;
            }
        }
        return false;
    }
    static int findNumberOfAmazingSubstrings(String A) {
        int N=A.length();
        String vowel=new String();
        vowel="aeiouAEIOU";
        int count=0;
        int ans=0;

        for (int i=N-1; i>=0; i--) {
            count++;
            if (isPresent(vowel, A.charAt(i))==true) {
                ans=ans+count;
            }
        }
        return ans%10003;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of string
        String A=sc.next();
        System.out.println(findNumberOfAmazingSubstrings(A));
    }

}
//TC is O(N), SC is O(N) if considering the string vowel that is created
