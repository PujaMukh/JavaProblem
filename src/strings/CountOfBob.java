package strings;
//find the count of "bob" in string A which has all lowercase letters

import java.lang.*;
import java.util.*;
public class CountOfBob {
    static int findCountOfBob(String A) {
        //hint: consider 'o' as mid and check left and right to see if it has 'b'.
        //I am doing it using 2 pointers

        int N=A.length();
        int P1=0; //left index
        int P2=1; //mid index
        int count=0;

        while(P2<N-1) { //N-1 as P2 is mid so we dont have to go till end
            if (A.charAt(P2)=='o') {
                if (A.charAt(P1)=='b' && A.charAt(P2+1)=='b') {
                    count++;
                }
            }
            P2++;
            P1++;

        }
        return count;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
       String A=sc.next();
        System.out.print(findCountOfBob(A));
    }
}
//TC is O(N), SC is O(1)

