package java_pattern;
//print this:
//A
//B B
//C C C
//D D D D

import java.lang.*;
import java.util.*;
public class CharacterPattern {
    static void charPrint(int N) {
        for (int i=1; i<=N; i++) { //outer row
            for (int j=1; j<=i; j++) {
                char ch=(char)(65+(i-1)); //ASCII of A is 65
                System.out.print(ch+" ");
            }
            System.out.println();

        }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        charPrint(N);
    }
}
