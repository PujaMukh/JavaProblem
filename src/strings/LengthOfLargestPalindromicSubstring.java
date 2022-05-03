package strings;
//given a string, calculate the length of the largest palindromic substring

import java.lang.*;
import java.util.*;
public class LengthOfLargestPalindromicSubstring {
    static int lengthOfLargestPalindrome(String A) {
        //hint: consider each index as center and move left and left to check if they match for odd
        //for even we have 2 centers
        char[]ch=A.toCharArray();
        int N=ch.length;
        int ans=0;
        int maxLength=0;
        int P1=0;
        int P2=0;
        //for odd

            for (int i=0; i<N; i++) {
                P1=i;
                P2=i;
                while (P1>=0 && P2<N && ch[P1]==ch[P2]) {
                    P2++;
                    P1--;
                }
                maxLength=P2-P1+1-2;
                ans=Math.max(ans,maxLength);

                P1=i; //for even
                P2=i+1;
                while(P1>=0 && P2<N && ch[P1]==ch[P2] ) {
                    P2++;
                    P1--;
                }
                maxLength=P2-P1+1-2;
                ans=Math.max(ans,maxLength);
            }

        return ans;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.print(lengthOfLargestPalindrome(A));

    }

}
//TC is O(N^2), SC is O(1)
