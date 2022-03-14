package java_string;
//given a word, reverse it

import java.lang.*;
import java.util.*;

public class ReverseString {
    static String reverseString(String A) { //return type is string
        //string cannot just be reversed since it is immutable, so we have to convert it to char array 1st
      char[] ch=A.toCharArray();
      int N=ch.length;

      int i=0;
      while (i<N/2) {
          char temp=ch[N-1-i];
          ch[N-1-i]=ch[i];
          ch[i]=temp;
          i++;
      }

      String S=new String();
       S= String.valueOf(ch);
       return S;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       String A=sc.next();
        System.out.println(reverseString(A));
    }
}
