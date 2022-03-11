package java_string;
//given a string and a char, count how many occurances of the char are present
import java.lang.*;
import java.util.*;
public class CharFreq {
    static int FreqChar(String s, char ch) { //return type will be int
        int l=s.length(); //length of string s
        int c=0; //initialize count variable
        for (int i=0; i<l; i++) {   //loop and logic to find the count
            if (s.charAt(i)==ch) {
                c++;
            }
        }
        return c;  ///return count

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();      //take input for string
        char ch=sc.next().charAt(0); //take input for character
        System.out.print(FreqChar(s,ch));

    }
}
