package java_very_simpleproblems;
import java.lang.*;
import java.util.*;
public class MinOf3 {
        public static void main(String[] args) {
            Scanner puja=new Scanner(System.in);
            int A=puja.nextInt();
            int B=puja.nextInt();
            int C=puja.nextInt();

            if (A<=B && A<=C) {
                System.out.println(A);
            }
            else if (B<=C && B<=A) {
                System.out.println(B);

            }
            else {
                System.out.println(C);

            }
        }
    }

