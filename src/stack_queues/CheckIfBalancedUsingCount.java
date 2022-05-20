package stack_queues;
//given a string which only contains ( or ), check if it is balanced using count
public class CheckIfBalancedUsingCount {
    public int solve(String A) {
        int count1=0;
        int count2=0;

        if ((A.charAt(0)==')') || (A.charAt(A.length()-1)=='(')) {
            return 0;
        }
        else {
            for (int i=0; i<A.length(); i++) {
                if (A.charAt(i)=='(') {
                    count1++;
                }
                else {
                    count2++;
                }
            }
            if (count1==count2) {
                return 1;
            }
        }

        return 0;
    }
}
