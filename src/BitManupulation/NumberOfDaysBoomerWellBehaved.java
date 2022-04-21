package BitManupulation;

import java.util.Scanner;

//if boomer behaves well a particular day, his food stash doubles.
//return number of days he was well behaved.
//again this is a pattern of finding number of 1's in binary
public class NumberOfDaysBoomerWellBehaved {
    static int wellBehaved (int A) {
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
        int A=sc.nextInt();

        System.out.println(wellBehaved(A));
    }
}
//TC is O(1), SC is O(1)
