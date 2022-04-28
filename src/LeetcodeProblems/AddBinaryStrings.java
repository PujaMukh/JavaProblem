package LeetcodeProblems;
//leetcode no 67
//given 2 binary strings, add it and return the result as string
import java.lang.*;
import java.util.*;
public class AddBinaryStrings {
    static String addBinary(String A, String B) {
        int N=A.length();
        int M=B.length();

        int sum=0;
        int digit=0;
        int carry=0;
        int i=N-1;
        int j=M-1;
        StringBuilder sb=new StringBuilder();

        while(i>=0 && j>=0) {
            sum=A.charAt(i)-'0'+B.charAt(j)-'0'+carry; //minus 0 converts it to int
            carry=sum/2;
            digit=sum%2;
            sb.append(digit);
            i--;
            j--;
        }

        if (N>M) {
            while (i>=0) {
                sum=A.charAt(i)-'0'+carry;
                carry=sum/2;
                digit=sum%2;
                sb.append(digit);
                i--;
            }
        }

        if (N<M) {
            while (j>=0) {
                sum=B.charAt(j)-'0'+carry;
                carry=sum/2;
                digit=sum%2;
                sb.append(digit);
                j--;
            }
        }
        if (carry>0) {
            sb.append(carry);
        }
        return sb.reverse().toString();


    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(addBinary(A, B));
    }
}
//TC is O(N) as we are checking the string length and SC is O(1) when not considering o/p