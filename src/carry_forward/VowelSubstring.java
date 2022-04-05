package carry_forward;
//given a string, find the count of all substrings that start with vowel

import java.lang.*;
import java.util.*;
public class VowelSubstring {
    static int amazingSubstring(String A) {
        int ans=0;
        int count=0;
        int N=A.length(); //length of string A

        for (int i=N-1; i>=0; i--) { //start from last and keep on counting until we get a vowel
            count++;
            if (A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u' || A.charAt(i)=='A' || A.charAt(i)=='E' || A.charAt(i)=='I' || A.charAt(i)=='O' || A.charAt(i)=='U') {
                ans=ans+count; //once we get a vowel, add it
            }
        }
        return ans%10003; //as the count can be very large in a large string

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string
        System.out.print(amazingSubstring(A));
    }
}
//O(N) time complexity and O(1) space complexity
