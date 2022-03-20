package java_string;

import java.util.Scanner;

//given a string which will start with 'a' (string will have atleast 1 a and 1 b), if the next character
// is b, return string yes or return string no
public class AOrBProblem {
    static String checkIfAB(String A) {
        int N=A.length();
        String P=new String("No");
        String S=new String("Yes");


        if (N==1) {      //handling edge case for a or b or.....
            return P;
        }

        int i=0;
        if(A.charAt(i)!='a') {
            return P;
        }
        while(i<N && A.charAt(i)=='a') {
            i++;
        }
        if(i==N || A.charAt(i)!='b') { //handling edge case for aa or aaacb
            return P;
        }
        while(i<N && A.charAt(i)=='b') {
            i++;
        }
        if(i!=N) {
            return P;
        }
        return S;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();      //take input for string
        System.out.print(checkIfAB(A));

    }
}
