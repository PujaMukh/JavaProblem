package LeetcodeProblems;
import java.lang.*;
import java.util.*;
//given a phrase conta
public class CheckIfPhrasePalindrome {
        static boolean isPalindrome(String s) {
            int N=s.length(); //length of string
            StringBuilder sb=new StringBuilder();

            //hint: 1st put all smaller characters and all capital to smaller chars in a //stringbuilder. Then traverse from back of stringbuilder and check if it is same.
            //dont forget to preserve the value of stringbuilder

            for (int i=0; i<N; i++) {
                if (s.charAt(i)>='a' && s.charAt(i)<='z') {
                    sb.append(s.charAt(i));

                }
                else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
                    int convertToInteger=(int)s.charAt(i)+32;
                    char c=(char) convertToInteger;
                    sb.append(c);

                }
                else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
                    sb.append(s.charAt(i));
                }
            }




            StringBuilder output=new StringBuilder(); //to store output

            int M=sb.length(); //length of the stringbuilder

            for (int i=M-1; i>=0; i--) {
                output.append(sb.charAt(i));

            }
            if (output.toString().equals(sb.toString())) {
                return true;
            }
            return false;

        }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); //take input for string

        System.out.println(isPalindrome(s));
    }
    }
//TC is O(N), SC is O(1)
