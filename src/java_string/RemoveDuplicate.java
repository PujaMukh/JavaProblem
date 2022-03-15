package java_string;
//given a string, remove all the duplicate characters from string and return the resultant string
//eg. aabbcc, o/p=abc

import java.lang.*;
import java.util.*;

public class RemoveDuplicate {
    static String removeDuplicate(String A) { //return type here is string
        //1st convert it to character array since we string is immutable
        char[] ch=A.toCharArray();
        int N=ch.length; //length of array

        //make another character arraylist to store the output since we dont know the output size
        ArrayList<Character>output=new ArrayList<Character>();

        for (int i=0; i<N;i++) {
            if (isPresent(output,ch[i])==false) {
                output.add(ch[i]);
            }
        }
        //now we have to convert the arraylist to array and then to string
        int m=output.size(); //size of arraylist
        char[]P=new char[m]; //blank array to store the results from arraylist named output

        //now we have to store all results from arraylist named output to array named P
        for (int i=0; i<m; i++) {
            P[i]=output.get(i);
        }
        //now we have to convert the array P to string
        //but 1st we have to create a new string S to store the output
        String S=new String();
        S=String.valueOf(P);
        return S;

    }
    static boolean isPresent(ArrayList<Character>C, char d) {
        int l=C.size(); //size of arraylist C
        for (int i=0; i<l; i++) {
            if (d==C.get(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string A
        System.out.print(removeDuplicate(A));

    }

}
