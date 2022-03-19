package java_string;

//lexicigraphically compare two strings and return either 0 or 1 or -1.
//0 if both are equal, 1 if A is lexicigraphically greater than B(if falls later in dictionary)
//otherwise -1 (if string A comes 1st in dictionary)

import java.lang.*;
import java.util.*;

public class CompareStrings {
    static int lexigraphicallyGreater(String A, String B) {
        //1st convert both to charcater array and then find size of both
        char[]ch1=A.toCharArray();
        int N=ch1.length; //length of char array ch1
        char[]ch2=B.toCharArray();
        int M=ch2.length; //length of char array ch2

        int i=0;
        int j=0;
        while(i<N && j<M) {
            if (ch1[i]==ch2[j]) {
                i++;
                j++;
            }
            else if (ch1[i]==ch2[j] && N==M) {
                i++;
                j++;
            }
            else if (ch1[i]>ch2[j]) {
                return 1;
            }
            else if(ch1[i]<ch2[j]) {
                return -1;
            }
        }
        if (M!=N) {
            if (M<N) {
                return 1;
            }
            else if (M>N) {
                return -1;
            }
        }

    return 0;
    }

    //function to find if puja is a substring of pujap to find edgecase
    /*static boolean isPresent(char[]D, char[] E) {
        int P=D.length; //length of D array
        int Q=E.length; //length of E array

        int i=0;
        while(i<P) {
            int temp=i;
            int j=0;
            while(j<Q) {
                if (D[temp]==E[j]) {
                    temp++;
                    j++;
                }
                else {
                    return false;
                }
                break;
            }
        }
        return true;
    }*/

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.print(lexigraphicallyGreater(A,B));
    }
}
