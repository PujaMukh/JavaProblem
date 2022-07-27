package arrays_maths;
//find number of special integers <=A
//it is special if it is divisible by both A & B
//A,B, C can range from 1 to 10^9
public class DivisorGame {
    public int solve(int A, int B, int C) {
        int lcm = B * C / gcd(B,C);

        return A/lcm;

    }

    int gcd(int a, int b) { //find gcd using recursion
        if ( a==0) {
            return b;
        }

        return gcd(b%a, a);
    }
}
