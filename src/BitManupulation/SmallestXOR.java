package BitManupulation;
//Given two integers A and B, find a number X such that A xor X is minimum possible,
// and the number of set bits in X equals B
public class SmallestXOR {
    public int solve(int A, int B) {
        int ans = 0; // initial value

        /* traversing the bits of A from LSB
         if number of bits in A is equal to B , then answer will be A. A^A=0 gives minimum
        so initial loop to match setbits of A to answer.
        then second loop if B is greater than setbits in A. in that case adding setbits from RSB*/

        for(int i=31; i>=0; --i) {
            if(B==0) return ans;
            if((A&(1<<i))>0) {
                ans |= (1<<i);
                --B;
            }
        }
        /*
        second loop , checking unset bit from RSB and
        changing it to setbit since B is greater than setbits in A
        */
        for(int i=0; i<=31; ++i) {
            if(B==0) return ans;
            if((ans&(1<<i))==0) {
                ans |= (1<<i);
                --B;
            }
        }

        return ans;

    }
}
