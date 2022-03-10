package java_simpleprograms;
import java.lang.*;
import java.util.*;
//find if given number can be written as 2^k

public class FindIfPower {
        static int Pow(String A) {

            int X=Integer.parseInt(A);

            while(X>2) {
                X=X/2;
                if ((X%2) !=0) {
                    return 0;
                }
            }
            return 1;
        }
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            String A=sc.nextLine();
            System.out.print(Pow(A));
        }
    }


