package java_string;
//convert one small char to its upper char

import java.lang.*;
import java.util.*;
public class UpperChar {
    static char upperChar(char a) { //pass a char named a
        int d=(int) a- 32; //convert the char to int and store it in int d
        char ch=(char) d; //convert the int d with upper value in char ch
        return ch; //return ch
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0); //take input for char a
        System.out.println(upperChar(a));

    }
}
