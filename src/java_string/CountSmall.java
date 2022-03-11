package java_string;
//count the number of small characters present in a string s
import java.lang.*;
import java.util.*;

public class CountSmall {
    static int CountSmallFreq(String s) { //return type here is int coz we have to count the number
        int l=s.length(); //length of string
        int c=0; //initialize count variable

        for (int i=0; i<l; i++) {
            if (s.charAt(i)>=97 && s.charAt(i)<=122) { //ASCII value of small a-z falls between 97-122
                c++;
            }
        }
        return c;  //return the result

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(CountSmallFreq(s));
    }
}
