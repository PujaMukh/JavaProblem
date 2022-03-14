package java_string;
//You have to return another copy of that input string A after removing last character from it

import java.lang.*;
import java.util.*;

public class RemoveLastChar {
    static String removeLastChar(String A) {
        //string is immutable, so we cannot directly delete anything from it.
        //So we have to copy the string in a character array 1st

        char[] ch=A.toCharArray(); //this will make the string into a character array named ch
        int N=ch.length; //length of the character array ch
        //now make another character array to store everything except the last array element

        char[] output=new char[N-1]; //this new character array will have size N-1 as last item is getting deleted

        for (int i=0; i<N-1; i++) {
            output[i]=ch[i];
        }
        //now we have to convert the character array named outut to string.
        //so we have to create a new string S to store the output

        String S=new String(); //create a new string named S to store the output
        S=String.valueOf(output); //convert charcter array named output to string and store it in string S
        return S;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.print(removeLastChar(A));
    }
}
