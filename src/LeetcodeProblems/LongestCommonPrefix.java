package LeetcodeProblems;

import java.util.Scanner;

//leetcode no 14
//given an array, find longest common prefix
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String s1="";

        if (strs.length==1) {
            return strs[0];
        }
        else {
            int ptr1=0;
            int ptr2=1;
            StringBuilder sb=new StringBuilder();
            s1=strs[ptr1];

            while (ptr2<strs.length) {

                String s2=strs[ptr2];

                int i=0;
                while (i<s1.length() && i<s2.length()) {
                    if (s1.charAt(i)==s2.charAt(i)) {
                        sb.append(s1.charAt(i));
                        i++;
                    }
                    else {
                        break;
                    }
                }

                s1=sb.toString();
                sb.setLength(0);
                ptr2++;
            }

        }
        return s1;



    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
       String[] strs=new String[N];
        for (int i=0; i<N; i++) {
            strs[i]=sc.next();

        }
        System.out.println(longestCommonPrefix(strs));
    }
}
