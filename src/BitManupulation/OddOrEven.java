package BitManupulation;

import java.util.Scanner;

//check if a number is odd or even
public class OddOrEven {
    //eg 2=10, if number & 1=0, that no is even
    //if even say true
    static boolean checkIf(int A) {
        if ((A & 1)==0) {
            return true;
        }
        return false;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();

        System.out.println(checkIf(A));
    }
}
//TC is O(1), SC is O(1)