package java_string;
//given a string in lowercase, return it in uppercase
import java.lang.*;
import java.util.*;
public class LowerToUpper {
    static char lToUp(char a) { //function to convert 1 character to upper character
        int c=(int)a- 32;
        char d=(char)c;
        return d;
    }
    static String lower(String A) {
        int N=A.length(); //length of given string A
        //make new string to store the output with uppercase
        StringBuilder D=new StringBuilder(); //make a new stringbuilder to store output
        for (int i=0; i<N; i++) {
            D.append(lToUp(A.charAt(i))); //add all values
        }
        return D.toString(); //convert to string and return

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take inout for string A
        System.out.print(lower(A));
    }

}
