package BitManupulation;
//now find number of 1 bit using left shift
import java.lang.*;
import java.util.*;
public class NUmberOf1Bit {
    //logic: do & of A and 1 to find if last digit is 1.
    //if it is 1, c++;
    //left shift the 1 to check the next number
    static int numberOneBit(int A) {
        int count=0;
        int res=0;
        int num=1;

        for (int i=0; i<32; i++) {
            res=num & A;

            if (res>0) {
                count++;
            }
            num=num<<1;

        }
        return count;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //take input for size of array
        System.out.println(numberOneBit(A));
    }
}
//TC is O(1), SC is O(1)
