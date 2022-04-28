package LeetcodeProblems;
//check if the 2 strings are valid anagrams
//leetcode no 242
//hint: strings are not valid anagram if lengths arent same
//strings are anagram if the letters of string 1 can be rearranged to form string 2

import java.lang.*;
import java.util.*;
public class ValidAnagram {
    static boolean checkIfValidAnagram(String S, String T) {
        int N=S.length();
        int M=T.length();

        if (N!=M) {
            return false;
        }

        //now make an int array of size 26 which will store the count of elements
        int[] characterCount=new int[26];
        for (int i=0; i<N; i++) {
            characterCount[S.charAt(i)-'a']++;
            //this will give the index. eg. if 1st letter is a, then a-a=0, so 0th index will have count
            characterCount[T.charAt(i)-'a']--; //count will dec for 2nd string
            //if at the end every element isnt 0 (since if there are 3 a's in string 1 and 3 a's in string 2
            //then at the end 3-3=0), then false

            }

        for (int i=0; i<26; i++) {
            if (characterCount[i]!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String T=sc.next();
        System.out.println(checkIfValidAnagram(S, T));
    }

}
//TC is O(N), SC is O(1)