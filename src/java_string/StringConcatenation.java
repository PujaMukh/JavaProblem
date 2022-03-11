package java_string;
//Concatenate two strings and print T lines each containing concatenated string.

import java.lang.*;
import java.util.*;

public class StringConcatenation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt(); //take input for T

        for (int i=0; i<T; i++) {
            String A=sc.next(); //take input for string A
            String B=sc.next(); //take input for string B

            System.out.println(A+B);
        }
    }

}
