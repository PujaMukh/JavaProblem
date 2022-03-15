package java_string;
//You are given a character string A and two integer ASCII codes B and C.
//You have to find and replace all the occurrences of the character having ASCII code equal to B
//with character having ASCII code equal to C and return the resultant string.
//eg. aabbccbb, 98 100. o/p=aaddccdd

import java.lang.*;
import java.util.*;

public class RemoveAndReplace {
    static String removeReplace(String A, int B, int C) {
 //1st convert the string to character array
        char[]ch=A.toCharArray();
        int N=ch.length; //length of character array named ch

        //now make an arraylist to store the output after removing the int B
        ArrayList<Character>D=new ArrayList<Character>();

        for (int i=0; i<N; i++) {

            if (ch[i]!=B) {
                D.add(ch[i]);
            }
            else if (ch[i] ==B) {
                int temp=ch[i];
                ch[i]=(char)C;
                D.add(ch[i]);
            }
        }
        //now elements removing int B and adding int c are added in the arraylist D
        //now find length of arraylist D
        int M=D.size();

        //now we have to convert it to array, so we can convert it to string in end and return the string
        //so make a new array to store the arraylist D
        char[]output=new char[M];
        //now transfer all elememts from arraylist D to array named output
        for (int i=0; i<M; i++) {
            output[i]=D.get(i);
        }
        //now all elements are added in array named output with size M
        //now we have to convert it to string and return it
        //for that 1st make a new string to store it
        String S=new String();
        S=String.valueOf(output);
        return S;

    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input for string A
        int B=sc.nextInt(); //take input for int B
        int C=sc.nextInt(); //take input for int C
        System.out.print(removeReplace(A,B,C));
    }
}
