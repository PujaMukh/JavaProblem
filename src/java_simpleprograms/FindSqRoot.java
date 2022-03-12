package java_simpleprograms;
//find square root of a number if it is perfect square. Else return -1 if not perfect square
//max value of A can be 10^8
import java.lang.*;
import java.util.*;

public class FindSqRoot {
        static int solve(int A) { //return type here is integer
            for (int i=1; i<=10000; i++) { //logic
                if (i*i==A) {
                    return i; //if perfect square, return the i
                }
            }
            return -1;  //if not, return -1 after loop ends
        }
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int A= sc.nextInt();
            System.out.println(solve(A));
        }
    }


