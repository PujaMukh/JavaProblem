package LeetcodeProblems;

import java.util.Scanner;

//leetcode no 58
//return the length of the last word in the string
public class LengthOfLastWorld {
    public static int lengthOfLastWord(String s) {
        int ptr1=0;
        int ptr2=0;
        int count=0;
        int ans=0;

        while (ptr2<s.length()) {

            while (ptr2!=s.length() && s.charAt(ptr2)!=' ') {
                count++;
                ptr2++;
            }

            ans=count;
            count=0;
            ptr1=ptr2;

            while (ptr2!=s.length() && s.charAt(ptr2)==' ') {
                ptr1++;
                ptr2++;
            }


        }
        return ans;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
        System.out.println(lengthOfLastWord(s));


    }
}
