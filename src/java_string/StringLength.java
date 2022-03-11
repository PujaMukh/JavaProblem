package java_string;
import java.lang.*;
import java.util.*;
public class StringLength {
    //Write a program to input an integer T and then each of T lines will have a string (S).
    //You have to print T lines each containing length of input string.
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt(); //take input for T

        for (int i=0; i<T; i++) {
            String S=sc.next(); //take input for string S

            int l=S.length();
            System.out.println(l);
        }
    }
}
