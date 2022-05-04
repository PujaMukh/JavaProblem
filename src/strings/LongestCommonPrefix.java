package strings;
//find the longest common prefix where an array of strings is given
//prefix means the 1st letter should match for sure
//hint: compare 2 strings and get the ans.
//in next step compare ans and next element and so on
//eg flo, flower, flight. Ans=fl

import java.lang.*;
import java.util.*;

public class LongestCommonPrefix {
    static String findPrefix(String A, String B) {
        //keep 2 pointers and check both the strings and inc P1 and P2 if matches
        int N=A.length();
        int M=B.length();
        int P1=0;
        int P2=0; //pointers
        StringBuilder output=new StringBuilder();
        while (P1<N && P2<M) {
            if (A.charAt(P1)==B.charAt(P2)) {
                output.append(A.charAt(P1));
                P1++;
                P2++;
            }
            else {
                break;
            }
        }
        return output.toString();

    }


    static String longestCommonPrefix(ArrayList<String>A) {
        int N=A.size();
        String ans="";
        //compare between 2 strings and set get a result by setting P1 and P2 at 0
        //compare that result with next string and so on

        if (N==1) {
            return A.get(0);
        }
        else if (N==0) {
            return "";
        }
        else {
            String s1=A.get(0);
            String s2=A.get(1);

            ans=findPrefix(s1,s2);
            for (int i=2; i<N; i++) {
                ans=findPrefix(ans, A.get(i));

            }
        }
        return ans;


    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<String>A=new ArrayList<String>();
        for (int i=0; i<N; i++) {
            A.add(sc.next());
        }
        System.out.print(longestCommonPrefix(A));
    }
}
//TC is O(N), SC is O(N)