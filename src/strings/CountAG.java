package strings;

import java.util.Scanner;

//give a string containing all upper case letters, count the number of substrings 'AG'
public class CountAG {
    static int countNumber(String A) {
        int count=0;
        int ans=0;
        for (int i=A.length()-1; i>=0; i--) {
            if (A.charAt(i)=='G') {
                count=count+1;
            }
            if (A.charAt(i)=='A') {
                ans=ans+count;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int output=countNumber(S);
        System.out.println(output);
    }
}
