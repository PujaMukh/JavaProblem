package java_string;
//given a string, reverse it

import java.lang.*;
import java.util.*;

public class ReverseString {
    static String reverseString(String A) { //return type is string
        //string cannot just be reversed since it is immutable, so we have to convert it to char array 1st
       char[] ch =A.toCharArray(); //change the string to char array and store it in a char array ch
        int N=ch.length; //length of character array

        int i=0;
       while(i<N/2) { //loop to swap elements in order to reverse the char array
           char temp = ch[N - 1 - i];
           ch[N - 1 - i] = ch[i];
           ch[i] = temp;
           i++;
       }

       //now everything is stored character array named ch
       //in the end, we have to convert the character array back to string and store it in new string S
        String S=new String(); //make a new string S to store the output
        S=String.valueOf(ch);
       return S;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input of string A
        System.out.print(reverseString(A));
    }
}
