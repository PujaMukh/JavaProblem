package java_string;
//convert the string in uppercase to lower using stringbuilder and append

import java.lang.*;
import java.util.*;
public class HiToLow {
    static char upperToLower(char A) { //function to convert 1 character in lowercase to uppercase
       int c =(int)A+32;
        char d=(char)c;
        return d;
    }
    static String UToLower(String A) {
        int N=A.length(); //length of given string A
        StringBuilder D=new StringBuilder(); //make a new stringbuilder to store the output
        for (int i=0; i<N; i++) {
            D.append(upperToLower(A.charAt(i)));
        }
        return D.toString();

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.print(UToLower(A));
    }

}
