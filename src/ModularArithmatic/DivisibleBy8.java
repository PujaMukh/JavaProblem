package ModularArithmatic;
//check if the given number is divisible by 8
//we know a number is divisible by 8 if the last 3 numbers are divisible by 8
public class DivisibleBy8 {
    public int solve(String A) {
        int N=A.length();
        int sum=0;

        if (N<3) {
            for (int i=0; i<N; i++) {
                sum=sum*10+A.charAt(i)-'0';
            }
            if (sum%8==0) {
                return 1;
            }
            else {
                return 0;
            }

        }

        if (N>=3) {

            for (int i=N-3; i<=N-1; i++) {
                sum=sum*10+A.charAt(i)-'0';
            }
            if (sum%8==0) {
                return 1;
            }

        }
        return 0;

    }
}
//TC is O(1), SC is O(1)
