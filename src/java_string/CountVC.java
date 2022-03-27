package java_string;
//count the number of vowels and consonants in a string. Return the count and the characters.
//eg. puja 2 u a 2 p j

import java.lang.*;
import java.util.*;
public class CountVC {
    static void countVC(String A) {
        int N=A.length(); //size of string A
        int count_vowel=0;
        int count_consonants=0;

        int[]vowel=new int[1]; //store the count of vowels in this array
        ArrayList<Character>vowel1=new ArrayList<Character>(); //create an arraylist to store the vowels
        int[]consonants=new int[1]; //store the count of consonants here
        ArrayList<Character>consonants1=new ArrayList<Character>(); //store all consonants here


        for (int i=0; i<N; i++) {
            if (A.charAt(i)=='a'|| A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u') {
                vowel1.add(A.charAt(i));
                count_vowel++;
            }
            else {
                count_consonants++;
               consonants1.add(A.charAt(i));
            }
        }
        for (int i=0; i<1; i++) {
            vowel[i]=count_vowel;  //final count of vowels is stored here
            consonants[i]=count_consonants; //final count of consonants is stored here
        }
        //now printing everything one by one

        for (int i=0; i<1; i++) {
            System.out.println(vowel[i]); //this will print total count of vowels 1st
        }
        int P=vowel1.size(); //size of arraylist which is storing all vowels

        for (int i=0; i<P; i++) {
            System.out.println(vowel1.get(i)); //this will print all vowels
        }

        for (int i=0; i<1; i++) {
            System.out.println(consonants[i]); //this will print total count of consonants 1st
        }

        int M=consonants1.size(); //size of arraylist which is storing all vowels
        for (int i=0; i<M; i++) {
            System.out.println(consonants1.get(i)); //this will print all consonants
        }


    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        countVC(A);
    }

}
