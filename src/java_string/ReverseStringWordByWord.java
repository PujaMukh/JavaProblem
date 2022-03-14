package java_string;
//given a string, reverse it word by word. Eg. "Monday is boring". Output will be "boring is Monday"

import java.lang.*;
import java.util.*;
public class ReverseStringWordByWord {
    static String revSentence(String A) { //return type is String
        //now split the string at spaces and store it in new string array B
        String[] B=A.split(" ");

        int N=B.length; //length of string array B

        String C=""; //make a new string C to store the output and initialize at space
        for (int i=N-1; i>=0; i--) {
            if (i==0) { //to avoid extra spaces at end
                C=C+B[i]; //just add all string arrays
            }
            else {
                C=C+B[i]+" ";
            }
            }
        return C; //return the output string c
        }

        public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine(); //take input for string A
            System.out.print(revSentence(A));
        }
    }


