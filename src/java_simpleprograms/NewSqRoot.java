package java_simpleprograms;
//given int A, return floor value of square root (if not a perfect square)
//A can go max till 10^10
//if it is a perfect square, return the answer

import java.lang.*;
import java.util.*;

public class NewSqRoot {
    static int FloorSquareRoot(int A) {

        for (int i=1; i<=100000;i++) {
            if ((i*i==A) || ((i+1)*(i+1)>A)) { //either one of these conditions will be true to return floor value
                return i;
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //take input for A
        System.out.println(FloorSquareRoot(A));
    }
}
