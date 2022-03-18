package java_very_simpleproblems;
//You are given 3 integer angles(in degrees) A, B and C of a triangle.
// You have to tell whether the triangle is valid or not.
//A triangle is valid if sum of its angles equals to 180.

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

