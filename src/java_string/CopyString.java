package java_string;
//return a string after removing last character now using direct charAt

import java.lang.*;
import java.util.*;
public class CopyString {
    static String copy(String A) {
        int N=A.length(); //length of string
        String output=""; //make a new string to store the o/p
        for (int i=0; i<N-1; i++) {
            output=output+A.charAt(i);
        }
        return output;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for String A
        System.out.print(copy(A));
    }
}
