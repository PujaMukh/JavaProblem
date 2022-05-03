package strings;
//given a character array, check if given substring is palindrome or not
//eg. anamadam, s=3, e=7, ans=yes

import java.lang.*;
import java.util.*;
public class SubstringPalindromeOrNot {
    static boolean substring(char[]A, int s, int e) {
       while (s<=(e-s)) {
           if (A[s]==A[e]) {
               s++;
               e--;
           }
           else {
               return false;
           }
        }
       return true;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        char[]A=new char[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.next().charAt(0);
        }
        int s=sc.nextInt();
        int e=sc.nextInt();
        System.out.print(substring(A,s,e));
    }

}
//TC is O(N), SC is O(1)
