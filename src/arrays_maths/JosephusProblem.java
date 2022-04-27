package arrays_maths;
//josephus problem-N people standing in a circle killing the next person and handing the sword
//to next person. Who is left at the end?
//we observed that if the N can be expressed at 2^n, the ans is always the person who started the game
//for numbers which cannot be expressed at 2^n, we have to come to 2^n
//it will be start+((N-smallest pow of 2<=N)*number of skips)


import java.lang.*;
import java.util.*;

public class JosephusProblem {
    static int findLastPerson(int N) {
        //start+((N-smallest pow of 2<=N)*number of skips)
        int pow=1;
        int smallestPow=1;

        while (pow<=N) {
            pow=pow*2;
            if(pow<=N) {
                smallestPow=pow;
            }
        }

        return 1+((N-smallestPow)*2);
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array

        System.out.println(findLastPerson(N));
    }

}
//TC is O(logn), SC is O(1)
