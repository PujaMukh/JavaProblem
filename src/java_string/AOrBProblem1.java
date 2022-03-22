package java_string;
//now do the AorB problem in a simple way
//a string will have atleast 1 a and 1 b and it cannot have nay other character.
//if yes, return yes, or return no
//eg. aab-yes, ab-yes, aa-no, bb-no, acb-no

import java.lang.*;
import java.util.*;
public class AOrBProblem1 {
    static String findIfStringSpecial(String A) {
        int N=A.length(); //length of string A
        int c=0; //start from 1st to count a's
        int c1=0; //start from end to count b

        if (N==0) { //edge case for empty string
            return "No";
        }

       else if (A.charAt(0)!='a') { //the character has to be a
           return "No";
       }
       else if (A.charAt(N-1)!='b') { //last has to be b
           return "No";
       }

        for (int i=0; i<N; i++) {
            if (A.charAt(i)=='a') {
                c++;
            }
            else {
                break;
            }
        }
        for (int i=N-1; i>=0; i--) {
            if (A.charAt(i)=='b') {
                c1++;
            }
            else {
                break;
            }
        }
        if (c+c1==N) {
            return "Yes";
        }
        return "No";
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take inout for string A
        System.out.print(findIfStringSpecial(A));
    }

}
