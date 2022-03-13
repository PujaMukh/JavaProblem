package java_simpleprograms;
//given an int A, check if it is armstrong number. Armstrong number is equal to sum of cubes of its digits
import java.lang.*;
import java.util.*;

public class ArmstrongNumber {
    static int checkIfArmstrongNumber(int A) {
        int sum=0; //initialize sum to 0
        int N=A; //put the value of A in a variable N to ease calculations
        while (N>0) { //repeat loop until the input>0
            int d=N%10;  //take the last number
            sum=sum+(d*d*d);
            N=N/10; //delete the last number
        }
        if (sum==A) {
            return 1;
        }
        return 0;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //take input of integer A

        System.out.println(checkIfArmstrongNumber(A));
    }
}
