package java_string;
//given a string in both upper and lower case, toggle the case
//eg. PUja, o/p=puJA

import java.lang.*;
import java.util.*;

public class ToggleCase {
    static String toggleCase(String A) {
        //1st convert the string to character array
        char[]ch=A.toCharArray();
        int N=ch.length; //length of char array named ch

        //now make a new char array of same size to store the output
        char[]P=new char[N];

        for (int i=0; i<N; i++) {
            if (ch[i]>=65 && ch[i]<=90) { //if 0th element in array ch for example is capital
                P[i]=upperToLower(ch[i]);
            }
            else if (ch[i]>=97 && ch[i]<=122) {
                P[i]=upperChar(ch[i]);
            }
        }
        //now char array P has all elements toggled in it
        //so now we have to convert it to string and return it
        //1st create a new string S
        String S=new String();
        S=String.valueOf(P);
        return S;

    }
 //function to convert smaller to upper
    static char upperChar(char a) { //pass a char named a
        int d=(int) a- 32; //convert the char to int and store it in int d
        char ch=(char) d; //convert the int d with upper value in char ch
        return ch; //return ch
    }
    //function to convert upper to smaller
    static char upperToLower(char A) { //function to convert a single uppercase character to lowercase
        int d=(int)A+32; //store the integer value of the small in d
        //then again convert it to char
        char b=(char) d;
        return b;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string A
        System.out.print(toggleCase(A));
    }
}

