package java_string;

import java.util.Arrays;

//by changing atmost B characters to any letter, find the min no of distinct chars in the string
public class ChangeCharacter {
    public int solve(String A, int B) {
        //find min no of distinct characters in final string
        //map freq of each char in a character array
        int[] countFreq=new int[26];
        for (int i=0; i<A.length(); i++) {
            countFreq[A.charAt(i)-97]++;
        }
        Arrays.sort(countFreq); //sort it
        int P1=0;
        //keep reducing from B
        while (P1<26 && B>0) {
            if (countFreq[P1]<=B) {
                B=B-countFreq[P1];
                countFreq[P1]=0;
            }
            P1++;


        }
        //now traverse and see which index have value>0
        int count=0;
        for (int i=0; i<26; i++) {
            if (countFreq[i]>0) {
                count=count+1;
            }
        }
        return count;



    }
}
