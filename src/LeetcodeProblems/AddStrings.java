package LeetcodeProblems;
//leetcode 415
//add 2 strings and return the string
//eg "123"+"11"="134"

import java.lang.*;
import java.util.*;
public class AddStrings {
    static String addStrings(String num1, String num2) {
        int N=num1.length();
        int M=num2.length();

        int i=N-1;
        int j=M-1;
        int carry=0;
        int digit=0;
        int sum=0;
        StringBuilder output=new StringBuilder();

        while (i>=0 && j>=0) {

            sum=num1.charAt(i)-'0'+num2.charAt(j)-'0'+carry;
            digit=sum%10;
            carry=sum/10;
            output.append(digit);
            i--;
            j--;

        }

        if (N>M) { //if string 1 is bigger
            while (i>=0) {
                sum=num1.charAt(i)-'0'+carry;
                digit=sum%10;
                carry=sum/10;
                output.append(digit);
                i--;

            }
        }

        if (N<M) {
            while (j>=0) {
                sum=num2.charAt(j)-'0'+carry;
                digit=sum%10;
                carry=sum/10;
                output.append(digit);
                j--;
            }
        }

        if (carry>0) {
            output.append(carry);
        }

        return output.reverse().toString();
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String num1=sc.next();
        String num2=sc.next();
        System.out.println(addStrings(num1, num2));
    }

}
//TC is O(N), SC is O(1) if not considering o/p
