package strings;
//perform 3 operations and return the result
//1) concatenate the given string once
//2) delete all capital
//3) make all vowel to #

import java.lang.*;
import java.util.*;
public class StringOperations {
    //use stringbuilder here as string is immutable so everytime I am doing a +, it has to create new string
    static boolean isPresent(String S, char c) {
        int N=S.length();
        for (int i=0; i<N; i++) {
            if (S.charAt(i)==c) {
                return true;
            }
        }
        return false;
    }
    static String stringOperations(String A) {
        int N=A.length();
        StringBuilder output=new StringBuilder();
        String vowel="aeiou";
        String allCharacters="bcdfghjklmnpqrstvwxyz";

        for (int i=0; i<N; i++) {
            if (isPresent(vowel, A.charAt(i))==true) {
                output.append('#');
            }
            else if (isPresent(allCharacters, A.charAt(i))==true) {
                output.append(A.charAt(i));
            }
        }
        output.append(output);
        return output.toString();
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A= sc.next();
        System.out.println(stringOperations(A));
    }

}
//TC is O(N), SC is O(N) considering stringbuilder
