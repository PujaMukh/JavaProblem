package java_very_simpleproblems;
//Write a program to input from user five numbers(A, B, C, D & E)
// representing marks of student in 5 subjects out of 100.
// You have to calculate percentage and then Grade of each student.
//If percentage >= 90% : Grade A
//If percentage >= 80% : Grade B
//If percentage >= 70% : Grade C
//If percentage >= 60% : Grade D
//If percentage >= 40% : Grade E
//If percentage < 40% : Grade F
//NOTE: You have to take the lowest integer of percentage. E.g. 90.8% will be treated as 90%.

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

