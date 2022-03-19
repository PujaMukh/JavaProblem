package java_very_simpleproblems;
//check if vowel or not

import java.lang.*;
import java.util.*;
public class VowelOrConsonant {
    static int checkIfVowel(char ch) {
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.print(checkIfVowel(ch));
    }
}
