package hashing;

import java.lang.*;
import java.util.*;

//check if characters of a given string can be rearranged to form a palindrome
//hint: a string is not a palindrome when the freq of occurance of the characters is odd for only one character
public class CheckIfCharactersPalindrome {
    static int checkIfPalindrome(String A) {
        int N=A.length();
        //make a hashmap
        HashMap<Character,Integer>charToFreq=new HashMap<>(); //declare

        for (int i=0; i<N; i++) {

            if (charToFreq.containsKey(A.charAt(i))) { //if there....
                int val=charToFreq.get(A.charAt(i)); //get the val
                charToFreq.put(A.charAt(i), val+1); //inc value by 1

            }
            else {
                charToFreq.put(A.charAt(i), 1); //if not there, make the freq 1
            }
        }
        int M=charToFreq.size();
        Set<Character>keyContainer=charToFreq.keySet(); //set containing all the keys in hashmap
        boolean flag=false;

        for (char key: keyContainer) {
            if (charToFreq.get(key)%2!=0) {//the value at that key. Here key same as i in for

                if (flag==false) {
                    flag=true;
                }
                else {
                    return 0;
                }

            }
        }
        return 1;

    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(checkIfPalindrome(A));
    }
}
//TC is O(N), SC is O(1) as characters are fixed which is 26