package BitManupulation;
//if sam takes help from friend, his score will inc by 1.
//if he does it himself, his score will double. Intial score is 0.
//he has to get exactly the score in given A
//calculate min help needed from friend.
//logic: it will start at 0, so he has to start by taking 1 help from friend to make it 1 atleast
//after checking all patterns, I am finding we have to calculate the number of 1's in given A

import java.lang.*;
import java.util.*;
public class MinHelpFromSam {
    static int minHelp (int A) {
        int count=0;
        int num=1;

        for (int i=0; i<32; i++) {
            if ((A & num)>0) {
                count++;
            }
            num=num<<1;
        }
        return count;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //take input for size of array

        System.out.println(minHelp(A));
    }
}
//TC is O(1), SC is O(1)

