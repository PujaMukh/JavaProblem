package BitManupulation;
//given an array which contains ele twice, except 2 ele whose freq is 1.
//find those 2 ele using bit
//step1: xor all ele (will get rid of ele which are twice)
//step 2:get set bit index and split array based on set or unset
public class SingleNumber3UsingBit {
    static int[] solve(int[] A) {
        int v=0; //step 1
        for(int i=0; i<A.length; i++) {
            v=v^A[i];
        }
        //step 2
        int index=-1;
        for (int i=0; i<31; i++) {
            if (((v>>i)& 1)==1) {
                index=i;
                break;
            }
        }
        int set=0;
        int unset=0;
        for (int i=0; i<A.length; i++) {
            if (((A[i]>>index) & 1)==1) {
                set=set^A[i];
            }
            else {
                unset=unset^A[i];
            }
        }
        int[] output=new int[2];
        output[0]=set;
        output[1]=unset;
        return output;


    }
}
//TC is O(N), sC is O(1)