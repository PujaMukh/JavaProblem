package java_string;
//return 0 if both strings are equal
//return 1 if lexigraphically greater (lies later in dictionary)
//return -1 if otherwise

import java.lang.*;
import java.util.*;
public class LexigraphicallyCompare {
    static int greater(String A, String B) {
        int N=A.length();
        int M=B.length();

        int i=0;
        int j=0;
        while (i<N && j<M) {
            if (A.charAt(i)==B.charAt(j)) {
                i++;
                j++;
            }
            else if (A.charAt(i)!=B.charAt(j)) {
                if (A.charAt(i)>B.charAt(j)) {
                    return 1;
                }
                else if (A.charAt(i)<B.charAt(j)) {
                    return -1;
                }
            }
        }
        if (N<M) {
            return -1;
        }
        else if (N>M) {
            return 1;
        }
    return 0;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.print(greater(A,B));
    }
}
//TC is O(N), SC is O(1)