package java_string;
//remove all duplicate characters in the string and return the resultant string
//eg. aabbccccccz, o/p=abcz

import java.lang.*;
import java.util.*;
public class RemoveAllDuplicateChar {
    static String remove(String A) {
        int N=A.length();
        //make another character array to store the output
        ArrayList<Character>ch=new ArrayList<Character>();
        for (int i=0; i<N; i++) {
            if (IsPresent(A.charAt(i),ch)==false) {
                ch.add(A.charAt(i));

            }
        }
        int M=ch.size(); //size of arraylist after getting the o/p
        char[]output=new char[M];
        for (int i=0; i<M; i++) {
            output[i]=ch.get(i);
        }
        String S=new String();
        S=String.valueOf(output); //convert the character array to string
        return S;

    }
    static boolean IsPresent(char a, ArrayList<Character>B) { //function to check if char is present in the arraylist
        int N=B.size();
        for (int i=0; i<N; i++) {
            if (a==B.get(i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string
        System.out.print(remove(A));
    }
}
