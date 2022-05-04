package strings;
//given a string and int B, at max you can change B characters. Find the min number of characters
//to be changed so that the number of distinct characters are minimum

import java.lang.*;
import java.util.*;
public class ChangeCharacter {
    static int solve(String A, int B) {
        int N=A.length();
        int[] countFreq=new int[26];
        for (int i=0; i<N; i++) {
            countFreq[A.charAt(i)-97]++; //eg if value is d, then 100-97th index will have freq of d
        }
        //now sort it
        Arrays.sort(countFreq);
        //keep a pointer and process 1st index and move forward
        int P1=0; //pointer
        while (P1<26 && B>=0) {
            if (countFreq[P1]<=B) {
                B=B-countFreq[P1];
                countFreq[P1]=0;
            }
            P1++;
        }
        //now traverse and count indexes whose values are greater than 0
        int count=0;
        for (int i=0; i<26; i++) {
            if (countFreq[i]>0) {
                count++;
            }
        }
        return count;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int B=sc.nextInt();
        System.out.println(solve(A,B));
    }
}
