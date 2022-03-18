package java_very_simpleproblems;
import java.lang.*;
import java.util.*;
public class MaxOf3 {

        public static void main(String[] args) {

            Scanner puja=new Scanner(System.in);
            int A=puja.nextInt();
            int B=puja.nextInt();
            int C=puja.nextInt();

            if (A>=B && A>=C) {
                System.out.println(A);
            }
            else if (B>=A && B>=C) {
                System.out.println(B);
            }
            else {
                System.out.println(C);
            }
        }
    }

