package java_string;

import java.lang.*;
import java.util.*;

//given a string trim all leading and trailing asterix character and return the remaining string
//eg. **he*l*lo, o/p=he*l*lo
public class TrimEnds {
    static String trimBothEnds(String A) {
        //1st convert the string A to character array since string is immutable
  //iterate from left to right and get how many special characters are there
        //then iterate from right to left and get how many special characters
        //while ch[i] is a character, iterate
        char[]ch=A.toCharArray();
        int N=ch.length; //length of character array ch


        //now make 2 arraylists, one to store the leading * and another arraylist to store the remaining elements
        ArrayList<Character> ch1=new ArrayList<Character>(); //to store the remaining elements

        int c1=0;
           int i=0;
            while(i<N && ch[i]<97) {
                c1++; //count of leading *'s
                i++;
            }

        for (i=c1; i<N; i++) {
            ch1.add(ch[i]); //added the remaining elements to the arraylist ch1
        }
        int M=ch1.size(); //length of character array ch1
        char[]ch2=new char[M]; //convert the arraylist ch1 to array ch2 to iterate from last again
        //size is still M
        for (i=0; i<M; i++) {
            ch2[i]=ch1.get(i); //copying from arraylist ch1, size is still M
        }
        int c2=0; //initializing to store count of trailing *'s
           int j=M-1;
            while(j>=0 && ch2[j]<97) {
                c2++;
                j--;
            }


        //now make new arraylist to store the remaining after deleting trailing *'s
        ArrayList<Character> ch3=new ArrayList<Character>();
        for (i=0; i<M-c2; i++) {
            ch3.add(ch2[i]);
        }
        //now result is added in arraylist ch3
        //so now we have to convert it to array and then to string
        //1st find the size of arraylist ch3

        int P=ch3.size(); //size of final arraylist
        //now make a new array of size P to store all elements from arraylist
        char[] result=new char[P];
        //now add all elements from arraylist ch3 to array result

        for (i=0; i<P; i++) {
            result[i]=ch3.get(i); //size is P
        }
        //now all elements are added in array named result with size P
        //now make a new string to store and convert it and return the string
        String S=new String();
        S=String.valueOf(result);
        return S;

    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string A
        System.out.print(trimBothEnds(A));
    }
}
