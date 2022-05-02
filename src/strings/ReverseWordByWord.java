package strings;
//given a string, reverse word by word with "no extra space and no inbuilt function"

import java.lang.*;
import java.util.*;
public class ReverseWordByWord {
    //hint:1) reverse all 1st
    //2)initialize P1 and P2 at 0 index and keep inc p2 till you get space
    //make P1=p2+1 and P2=p1

    static String revWordByWord(String S) {
        int N=S.length();
        char[]A=S.toCharArray();
        //1) reverse everything
        for (int i=0; i<N/2; i++) {
            char temp=A[N-1-i];
            A[N-1-i]=A[i];
            A[i]=temp;
        }

        //2) inc P2 until you get a space
        int P2=0;
        int P1=0;

        while(P1<N) {
            while (P2<N && A[P2]!=' ') {
                P2++;
            }
            //reverse when it hits a space from P1 to P2-1 indexes
            int k=P1;
            int j=P2-1;
            while (k<j) {
                char temp=A[j];
                A[j]=A[k];
                A[k]=temp;
                k++;
                j--;
            }
            //move to next
            P1=P2+1;
            P2=P1;

        }
        return String.valueOf(A);

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        String output=revWordByWord(S);
        System.out.print(output);
    }
}
//TC is O(N), SC is O(N)
