package strings;
//given a character array containing small and capital, toggle every character

import java.lang.*;
import java.util.*;
public class ToggleUsingXor {
    //based on our observation we see just the 5th bit is 1 or 0 for 97 or 65, everything else is same
    //so we xor with 2^5=32
    static char[] toggle(char[]A) {
        int N=A.length;
        for (int i=0; i<N; i++) {
           int d=(int)A[i]^32;
           A[i]=(char)d;
        }
        return A;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        char[]A=new char[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.next().charAt(0);
        }

        char[]output=toggle(A);
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" ");
        }
    }
}
//TC is O(N), SC is O(1)
