package java_string;
//given a string s, check if it is entirely capital or not. If yes, return true

import java.lang.*;
import java.util.*;

public class CheckCapital {
    static boolean CheckIfCapital(String s) { //here return type is true/false, so boolean
        int l=s.length(); //check length of string s

        for (int i=0; i<l; i++) {
            if (s.charAt(i)<65 || s.charAt(i)>90) { //if the ASCII doesnt fall within rage of 65-90, then return false
                return false;
            }
        }
        return true; //if whole loop completes and we dont get false, then return true
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); //take input for string s
        System.out.print(CheckIfCapital(s));
    }
}
