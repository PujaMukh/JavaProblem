package java_string;
//add the 2 strings

import java.lang.*;
import java.util.*;
public class Concatenate {
    static String concatenateStrings(String A, String B) {
        String output=new String(); //make new string to store the output
        output=A+B; //concatenate
        return output; //return the string
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string A
        String B=sc.next(); //take input for string B
        String C=concatenateStrings(A, B); //since above function is returning a string, make a new string and store the above function
        System.out.println(C); //print it
    }
}
