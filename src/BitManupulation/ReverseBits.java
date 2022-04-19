package BitManupulation;
//given a 32 bit number, reverse its bits
public class ReverseBits {
    public long reverse(long a) {
        //for 3, the last 2 digits in 32 bit is 11
        //do & 1
        //if it is 1, then do sum=sum+1*2^31
        //left shift 1 by 1 and check every digit

        long num=1;
        long ans=0;

        for (int i=31; i>=0; i--) {
            long result=a & num;

            if (result>0) {
                ans=ans+ (1*((long) Math.pow(2, (double)i)));
            }

            num=num<<1;
        }
        return ans;
    }
}
//tC is O(1), SC is O(1)


