package java_string;
//given a string in small, convert it to it's upper format
//eg. input-puja, output-PUJA

import java.lang.*;
import java.util.*;

public class SmallToUpper {
    static String smallToUpperString(String A) { //return type is string
        //now convert it to char array and store it in char array named ch
        char[]ch=A.toCharArray();

        int N=ch.length; //take the length of array ch

         char[] B=new char[N]; //new array to store the upper character result

        for (int i=0; i<N; i++) {
            B[i]=upperChar(ch[i]);
        }

        String output=new String(); //create new output string named output
        output=String.valueOf(B); //convert the char array B to string named output
        return output;

    }
    static char upperChar(char a) { ////function to make 1 character to capital
        int d=(int) a- 32; //int d will store ASCII of upper case char
        //now convert it to char and store the result in char b
        char b=(char) d; //convert the int d with upper value in char b
        return b; //finally return the 1 character in capital
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.print(smallToUpperString(A));
    }
}
