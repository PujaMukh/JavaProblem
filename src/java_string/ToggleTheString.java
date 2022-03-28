package java_string;
//change all upper case to lowercase and vice versa in a string

import java.lang.*;
import java.util.*;
public class ToggleTheString {
    static String toggle(String A) {
        int N=A.length(); //size of string A
        StringBuilder S=new StringBuilder();
        for (int i=0; i<N; i++) {
            if (A.charAt(i)>=65 && A.charAt(i)<=90) {
                S.append(upperToLower(A.charAt(i)));
            }
            else if (A.charAt(i)>=97 && A.charAt(i)<=123) {
                S.append(lowerToUpper(A.charAt(i)));
            }
        }
        return S.toString(); //return after converting the stringbuilder to string

    }
    static char lowerToUpper(char a) { //function to convert lowercase to uppercase
      int d  =(int)a-32;
        char c=(char)d;
        return c;
    }
    static char upperToLower(char A) { //function to convert uppercase to lowercase
        int d  =(int)A+32;
        char c=(char)d;
        return c;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string A
        System.out.print(toggle(A));
    }

}
