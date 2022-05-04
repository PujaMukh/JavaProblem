package strings;
//now print the longest palindromic substring

import java.lang.*;
import java.util.*;
public class PrintLongestPalindromicSubstring {
    static String longestPalindrome(String A) {
        int N=A.length();
        int P1=0;
        int P2=0;
        int ans=0;
        int maxLength=0;
        int startIndex=0;
        int endIndex=0;
        StringBuilder sb=new StringBuilder();

        for (int i=0; i<N; i++) {

            P1=i; //for odd
            P2=i;
            while (P1>=0 && P2<N && A.charAt(P1)==A.charAt(P2)) {
                P1--;
                P2++;
            }
            ans=P2-P1+1-2;
            if (ans>maxLength) { //if we are updating maxlength, the keep a track of the indexes
                maxLength=ans;
                startIndex=P1+1;
                endIndex=P2-1;

            }



            //for even
            P1=i;
            P2=i+1;
            while (P1>=0 && P2<N && A.charAt(P1)==A.charAt(P2)) {
                P1--;
                P2++;
            }
            ans=P2-P1+1-2;

            if (ans>maxLength) { //if we are updating maxlength, the keep a track of the indexes
                maxLength=ans;
                startIndex=P1+1;
                endIndex=P2-1;

            }
        }
        for (int i=startIndex; i<=endIndex; i++) {
            sb.append(A.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
       String A=sc.next();
        System.out.println(longestPalindrome(A));
    }
}
//TC is O(N^2), SC is O(N) because of stringbuilder
