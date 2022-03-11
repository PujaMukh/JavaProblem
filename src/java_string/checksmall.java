package java_string;
//given a string s, check if all characters are small or not. If yes, return true

import java.lang.*;
import java.util.*;
public class checksmall {
    static boolean CheckIfSmall(String s) { //return type is boolean
        int l=s.length(); //length of string s

        for (int i=0; i<l; i++) {
            if (s.charAt(i)<=96 || s.charAt(i)>=123) { //if any char doesnt fall within ASCII value 97 to 122, then it is not small
                return false; //then return false
            }
        }
        return true; //if the full loop runs and there's no value other than 97 to 122, return true
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); //take input for string s
        System.out.print(CheckIfSmall(s));
    }
}
