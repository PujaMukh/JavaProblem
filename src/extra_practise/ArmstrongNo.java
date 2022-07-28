package extra_practise;

import java.util.Scanner;

//check if the no is equal to sum of cubes of its digits
public class ArmstrongNo {
    static boolean armstrongNo(int N) {
       int temp=N;
       int sum=0;
       while (temp>0) {
           int digit=temp%10;
           sum=sum+(digit*digit*digit);
           temp=temp/10;
       }
       if (sum==N) {
           return true;
       }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(armstrongNo(N));


    }
}
