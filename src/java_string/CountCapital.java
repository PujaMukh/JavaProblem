package java_string;
//given a string, how many capital characters are there in the string
import java.lang.*;
import java.util.*;
public class CountCapital {
    static int CapitalLetter(String s) {
        int c=0; //initialize count variable
        int l=s.length(); //length of string s

        for (int i=0; i<l; i++) { //loop to calculate the count
            if (s.charAt(i)>=65 && s.charAt(i)<=90) { //in ASCII value, A-Z falls between 65 to 90
                c++;
            }
        }
        return c;   //return the count

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); //take input for string s
        System.out.print(CapitalLetter(s));
    }

}
