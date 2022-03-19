package java_very_simpleproblems;
//check if triangle if valid or not
import java.lang.*;
import java.util.*;
public class ValidTriangle {
        public static void main(String[] args) {
            Scanner puja=new Scanner(System.in);
            int A=puja.nextInt();
            int B=puja.nextInt();
            int C=puja.nextInt();

            if (A+B+C==180) {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }

        }
    }

