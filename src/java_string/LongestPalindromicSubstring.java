package java_string;
//given a string, find the longest palindromic substring.
//hint: consider 2 cases: abba and naman-both are palindrome
public class LongestPalindromicSubstring {
    public String longestPalindrome(String A) {
        //2 cases-naman and abba
        int length=0;
        int maxlength=0;
        int startIndex=0;
        int endIndex=0;
        for (int i=0; i<A.length(); i++) {
            int p1=i;                                               //naman-odd case
            int p2=i;
            while (p1>=0 && p2<A.length() && A.charAt(p1)==A.charAt(p2)) {
                p1--;
                p2++;

            }
            length=p2+1-p1-2;
            if (length>maxlength) {
                maxlength=length;
                startIndex=p1+1;
                endIndex=p2-1;
            }

            //for even-abba
            p1=i;
            p2=i+1;
            while (p1>=0 && p2<A.length() && A.charAt(p1)==A.charAt(p2)) {
                p1--;
                p2++;
            }
            length=p2+1-p1-2;
            if (length>maxlength) {
                maxlength=length;
                startIndex=p1+1;
                endIndex=p2-1;
            }


        }
        StringBuilder sb=new StringBuilder();
        for (int j=startIndex; j<=endIndex; j++) {
            sb.append(A.charAt(j));

        }
        return sb.toString();

    }
}
//TC is O(N^2) worst case