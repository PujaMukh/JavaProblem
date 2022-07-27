package arrays_maths;
//for a very large no, find gcd of all nos between A & B
public class GCDOfAllNumbersBetAandB {
    ////In the question, we are asked to find the GCD of all the numbers from A to B including A and B.
    ////One of the properties of GCD is GCD of any two consecutive numbers is always 1.
    ////So the only case in which the GCD will not be equal to one is when A and B are equal and is same as the input

    public String solve(String A, String B) {
        if (A.equals(B)) {
            return A;
        }
        return "1";
    }
}
//TC is O(1), SC is O(1)