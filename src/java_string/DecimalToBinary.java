package java_string;
//convert decimal to binary

import java.lang.*;
import java.util.*;

public class DecimalToBinary {
    static String decimalToBinary(long A) {

       String P=""; //initialize a string to store all modulus
        long d=0; //initializing remainder to 0
        while(A>0) { //run it until number =0
                d=A%2;
                P=P+d; //just adding all remainders to string
                A=A/2; //this is how we convert decimal to binary
            }
        //but since it is down to up, we have to reverse the string
        //so make a charcater array and reverse it and convert it back to string

        char[] ch=P.toCharArray(); //convert the string to character array
        int N=ch.length; //length of array
        int i=0; //now we have to reverse the array
        while(i<N/2) { //swap it to reverse
            char temp=ch[N-1-i];
            ch[N-1-i] = ch[i];
            ch[i]=temp;
            i++;
        }

        String S=new String(); //make new string to store, swap and return
        S=String.valueOf(ch);
        return S;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long A=sc.nextLong();
        System.out.println(decimalToBinary(A));
    }
}
