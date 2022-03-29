package java_string;
//given a string, replace int B with int C

import java.lang.*;
import java.util.*;
public class ReplaceBWithC {
    static String replace(String A, int B, int C) {
        char[]D=A.toCharArray(); //convert to character array
        int N=D.length; //length of character array D
        for (int i=0; i<N; i++) {
            if (D[i]==B) {
                int temp=D[i];
                D[i]=(char)C;
            }
        }
        String S=new String(); //make a new string to store the o/p
        //now convert to string
        S=String.valueOf(D);
        return S;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int B= sc.nextInt();
        int C=sc.nextInt();
        System.out.print(replace(A,B, C));
    }
}
