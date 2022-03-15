package java_string;
//given a string A in lowercase and an ASCII code int b(between 97-122), you have to remove all occurances of the int b and return the resultant string
//eg. A=aabbaabb, int b=98, output=aaaa

import java.lang.*;
import java.util.*;

public class RemoveOccurances {
    static String removeOccurances(String A, int B) {
        //1st convert the string to character array named ch
        char[] ch = A.toCharArray(); //String A is converted to character array
        int N = ch.length; //length of character array ch

        ArrayList<Character> output = new ArrayList<Character>(); //arraylist to store the output array because we dont know the size of the output


        for (int i=0; i<N; i++) {
            if ((int) ch[i] !=B) {
                output.add(ch[i]); //add it to arraylist if it doesnt match
            }
        }
        //now we have to convert the arraylist to array because we have to finally convert it to string
        int l=output.size(); //size of arraylist
        char[] P=new char[l]; //make a new charcter array to store the converted arraylist

        for (int i=0; i<l; i++) {
            P[i]=output.get(i); //store all elements in arraylist to character array P
        }

        String S=new String(); //make a new string to return the output
        S=String.valueOf(P); //convert the array P to string
        return S; //return it
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string A
        int B=sc.nextInt(); //take input for int B
        System.out.print(removeOccurances(A,B));
    }

}
