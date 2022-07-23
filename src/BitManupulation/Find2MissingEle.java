package BitManupulation;
//given an array containing all ele from 1 to N+2 except 2 ele, find the 2 missing ele
public class Find2MissingEle {
    //same as singleNumber3usingbit
    static int[] solve(int[] A) {
        //1) xor of all array ele
        //2) xor of all ele from 1 to n+2
        //3) xor above 2 and rest same as other ques mentioned
        int a=0;
        for (int i=0; i<A.length; i++) { //step 1
            a=a^A[i];
        }

        int b=0;
        for (int i=1; i<=A.length+2; i++) {
            b=b^i;
        }

       int v=a^b;

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
//TC is O(N), SC is O(1)