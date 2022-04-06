package carry_forward;
//given an array containing the state of bulb, how many min operations needed to turn all on
//1 is on, 0 is off
//only problem is because of wiring fault, if we toggle with one switch, all switches on its right toggles

import java.lang.*;
import java.util.*;

public class Bulb {
    static int bulbProblem(int[]A) {
        int N=A.length;
        int count=0;
       for (int i=0; i<N; i++) {
           if (A[i]==0 && count%2==0) {
               //if even flips, then 0 is actually 0, so increase count

               count++;
           }
           else if (A[i]==1 && count%2!=0) {
               //if odd flips, then 1 is actually 0, so count++
               count++;
           }
       }
  return count;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        System.out.print(bulbProblem(A));
    }
}

//TC is O(N) and SC os O(1)
