package ModularArithmatic;
//check if the give number is a leap year
//leap year if: it is multiples of 400
//or if it is mutiples of 4 but not multiples of 100
public class LeapYear {
    public int solve(int A) {
        if (A%400==0) {
            return 1;
        }
        else if (A%100!=0 && A%4==0) {
            return 1;
        }
        return 0;
    }
}
//TC is O(1), SC is O(1)
