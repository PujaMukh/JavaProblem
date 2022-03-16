package java_string;
//trim all *s from beginning and end by simple method
//eg. **h*e*llo***, o/p=h*e*llo

import java.lang.*;
import java.util.*;

public class TrimEndsSimple {
    static String trimEnds(String A) {
        int N=A.length(); //length of string A
        int i=0;
        int c1=0;
        int c2=0;
        while(A.charAt(i)=='*') {
            c1++;
            i++;
        }
        int j = N-1;
        while(A.charAt(j)=='*') {
            c2++;
            j--;
        }

        //make another string S to store the output
        String S=new String();
         S="";
        for (i=c1; i<N-c2; i++) {
            S=S+A.charAt(i);
        }
        return S;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.print(trimEnds(A));
    }

}
