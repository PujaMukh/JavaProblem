package java_string;
//remove all occurance of int B in string A and return the remaining
//now do it using stringbuilder and append

import java.lang.*;
import java.util.*;
public class RemoveOcc {
    static String remove(String A, int B) {
        int N=A.length(); //length of string A
        StringBuilder output=new StringBuilder(); //make a new stringbuilder to store the output
        for (int i=0; i<N; i++) {
            if (A.charAt(i)!=B) {
                output.append(A.charAt(i));
            }
        }
        return output.toString(); //return after converting stringbuilder to string
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string A
        int B=sc.nextInt(); //take input for integer B
        System.out.print(remove(A,B));
    }
}
