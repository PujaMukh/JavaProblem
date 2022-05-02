package strings;
//given a string, reverse part of a string
//eg anaconda, s=2, e=6, ans=andnocaa

import java.lang.*;
import java.util.*;
public class ReversePartOfAString {
    static String reverse(String A, int s, int e) {
        char[]ch=A.toCharArray();
        int N=ch.length;

       while (s<e) {
           char temp=ch[e];
           ch[e]=ch[s];
           ch[s]=temp;
           s++;
           e--;
       }
        //now time to change it to string and return
        return String.valueOf(ch);

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        String A=sc.next();
        int s=sc.nextInt();
        int e= sc.nextInt();

        String output=reverse(A,s,e);
        System.out.print(output);
    }
}
//TC is O(N), SC is O(N)
