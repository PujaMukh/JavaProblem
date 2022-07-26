package BitManupulation;
//given A, count total set bits from 1 to A
//Brute force is counting set bits for each number and running outer loop from 1 to A
public class CountSetBitsFrom1ToA {
    public int solve(int A) {
        long mod = 1000000007l;
        long count = 0l;
        long num = (long)A;
        for(int i=30; i>0; i--){
            if(((num>>i)&1)==0){
                continue;
            }
            long leastBitContribution = (i*(1l<<(i-1)))%mod;
            count = (count + leastBitContribution) %mod; // 2^i
            num = ((1<<(long)i)^num); // number unseting current bit
            long currentBitContribution = num + 1;
            count = (count + currentBitContribution) %mod;
        }
        if((num&1)==1){
            count++;
        }
        return (int)(count%mod);
    }

}
