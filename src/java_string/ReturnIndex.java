package java_string;
//return the 1st occurance index of the substring
//if not present, return -1

import java.lang.*;
import java.util.*;
public class ReturnIndex {
    static int returnIndex(String A, String B) {
        int N=A.length(); //length of string A
        int M=B.length(); //length of string B

        int i=0;
        while (i<N) {
            int temp=i;
            int j=0;
            while(j<M) {
                if (A.charAt(temp)==B.charAt(j)) {
                    temp++;
                    j++;
                }
                else if (A.charAt(temp)!=B.charAt(j)){
                    break;
                }
            }
            if (j==M) {
                return i+1;
            }
            i=i+1;
        }
     return -1;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.print(returnIndex(A, B));
    }

}
