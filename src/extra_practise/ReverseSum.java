package extra_practise;

import java.util.Scanner;

//given a number, find sum of the number and its reverse.
// eg 536+635=1171
public class ReverseSum {
    static int findSum(int N) {
        int temp=N;
        //now play with temp
        int num=0;
        while (temp>0) {
            int digit=temp%10;
            num=num*10+digit; //num=num*base+digit
            temp=temp/10;
        }
        return N+num;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        System.out.println(findSum(N));

    }
}
