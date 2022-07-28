package extra_practise;

import java.util.Scanner;

//Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2
public class SeriesPrinting {
    //eg 10, 4
    //print 1st 10 terms of 3n+2 which are not multiples of 4
    //o/p= 5 11 14 17 23 26 29 35 38 41

    static void print(int N1, int N2) {
        int count=0;
        for (int i=1; i<=N1*N1; i++) {
            int val=(3*i)+2;
            if (val%4!=0) {
                System.out.print(val+" ");
                count++;
                if (count==N1) {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        print(N1, N2);

    }
}
//TC is O(N), SC is O(1)