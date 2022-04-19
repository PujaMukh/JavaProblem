package LeetcodeProblems;
//leetcode ques 258
//find sum of all digits and keep summing until the final number is 0
public class DigitalRoot {
    public int addDigits(int num) {
        int sum=0;

        if (num==0) {
            return 0;
        }

        while (num>0) {
            sum=sum+num%10;
            num=num/10;

            if (sum/10==0 && num==0) {
                break;
            }

            if (num==0) {
                num=sum;
                sum=0;
            }
        }
        return sum;

    }
}
//TC is O(sqrt N), SC is o(1)
