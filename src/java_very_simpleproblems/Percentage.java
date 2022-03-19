package java_very_simpleproblems;
//percentage problem

import java.lang.*;
import java.util.*;
public class Percentage {
        public static void main(String[] args) {
            Scanner puja=new Scanner(System.in);
            int A=puja.nextInt();
            int B=puja.nextInt();
            int C=puja.nextInt();
            int D=puja.nextInt();
            int E=puja.nextInt();

            int perc=0;
            perc=(A+B+C+D+E)/5;

            if (perc>=90) {
                System.out.println(perc+" "+ "A");
            }
            else if (perc>=80) {
                System.out.println(perc+" "+ "B");
            }
            else if (perc>=70) {
                System.out.println(perc+" "+ "C");
            }
            else if (perc>=60) {
                System.out.println(perc+" "+ "D");
            }
            else if (perc>=40) {
                System.out.println(perc+" "+ "E");
            }
            else {
                System.out.println(perc+" "+ "F");
            }

        }
    }

