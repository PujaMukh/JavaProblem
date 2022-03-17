package java_string;
//Write a program to input T strings (S) from user and print after reversing them.

import java.lang.*;
import java.util.*;

public class ReverseStrings {
    static String revString(String A) {
        //1st convert the string A to charcater array
        char[]ch=A.toCharArray();
        int N=ch.length; //length of character array ch

        int i=0;
        while (i<N/2) {
            char temp=ch[N-1-i];
            ch[N-1-i]=ch[i];
            ch[i]=temp;
            i++;
        }
        //now convert it to string
        String S=new String();
        S=String.valueOf(ch);
        return S;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for (int i=0; i<T; i++) {
            String A=sc.next();
            System.out.print(revString(A));
        }
        System.out.println();

    }
}
