package LeetcodeProblems;
//leetcode question 7.
//reverse an integer. -123 should be -321 in integer range.
//here I used long
public class ReverseInteger {
    public int reverse(int x) {
        //logic: if the number is less than 0, we have to convert it to postive by mutilplying
        //-1 and at the end multiply again with -1
        //else just do the reverse of rev=rev*base+d
        //WITHOUT USING STRING



        int temp=x;
        long rev=0;

        if (x<0) {
            temp=temp*(-1); //make it positive if negative
        }

        while (temp>0) {

            int d=temp%10;
            rev=rev*10+d;

            if (((-1)*rev<Integer.MIN_VALUE) || (rev>Integer.MAX_VALUE)) {
                return 0;
            }
            temp=temp/10;

        }

        if (x<0){
            return (int)rev*(-1);


        }
        return (int)rev;

    }
}
//TC is O(log n), SC is O(1)
