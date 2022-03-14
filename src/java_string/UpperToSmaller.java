package java_string;
//given a string A in uppercase, convert it to lower case

import java.lang.*;
import java.util.*;

public class UpperToSmaller {
        static String solve(String A) { //return type is a string
            //now convert the string A to character array ch
            char[] ch=A.toCharArray();
            int N=ch.length; //length of inout array ch

            //now make another character array B to store the output array
            char[]B=new char[N];

            for (int i=0; i<N; i++) {
                B[i]=upperToLower(ch[i]);
            }
            //now make a string named output to return the result after converting the char array B to string
            String output=new String(); //make new string named output  to store the result
            output=String.valueOf(B);
            return output;
        }

        static char upperToLower(char A) { //function to convert a single uppercase character to lowercase
            int d=(int)A+32; //store the integer value of the small in d
            //then again convert it to char
            char b=(char) d;
            return b;
        }

        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            String A=sc.next(); //take input for string A
            System.out.print(solve(A));
        }
    }


