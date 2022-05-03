package strings;
//now reverse word by word considering there can be leading and trailing spaces and more than 1
//space in between
//ignore all leading and trailing spaces and consider only 1 space for in between

import java.lang.*;
import java.util.*;
public class ReverseWordByWordMultipleSpaces {
    static String solve(String A) {
        char[]ch=A.trim().toCharArray();
        int N=ch.length;
//even after removing the space is still remaining in char array as it is fixed size, so .trim
        int start=0;
        int end=N-1;
        while (start<end && ch[start]==' ') {
            start++;
        }
        while (end>start && ch[end]==' ') {
            end--;
        }

        //reverse the full String
        for (int i=start; i<=end/2; i++) {
            char temp=ch[end-i];
            ch[end-i]=ch[i];
            ch[i]=temp;
        }

        //now inc P2 until you get a space
        int P1=0;
        int P2=0;
        while (P1<=end) {
            while (P2<=end && ch[P2]!=' ') {
                P2++;
            }
            //once it hits space, it will come out of loop
            int k=P1;
            int j=P2-1;

            while (k<j) {
                char temp=ch[j];
                ch[j]=ch[k];
                ch[k]=temp;
                k++;
                j--;
            }
            while (P2<=end && ch[P2]==' ') {
                P2++;
            }
            P1=P2;
        }
        return String.valueOf(ch);
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String output=solve(A);
        System.out.print(output);
    }

}
//TC is O(N), SC is O(N)
