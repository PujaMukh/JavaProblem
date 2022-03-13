package java_sample_oned_array;
//return an array of the count of vowels and consonants in a string A

import java.lang.*;
import java.util.*;

public class VowelsConsonants {
    static ArrayList<Integer>vowelsConsonants(String A) { //return type here is Array
        int count_vowels=0; //initialize count of vowels to 0
        int count_consonants=0; //initialize count of consonants to 0
        int l=A.length(); //length of string A

        ArrayList<Integer>B=new ArrayList<Integer>(); //create a new arraylist B to store the output

        for (int i=0; i<l; i++) { //loop to check the logic
            if (A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' ||A.charAt(i)=='o' || A.charAt(i)=='u') {
                count_vowels++;
            }
            else {
                count_consonants++;
            }
        }
        B.add(count_vowels); //add the values to arraylist B
        B.add(count_consonants);
        return B; //return the arraylist B
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take the input for string A
        System.out.println(vowelsConsonants(A)); //print it

    }
}
