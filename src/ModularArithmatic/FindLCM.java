package ModularArithmatic;

import java.util.concurrent.BlockingDeque;

//given 2 +ve numbers, find their LCM
public class FindLCM {
    static int findLCM(int A, int B) {
        int max=0;
        int min=0;
        if (A>B) {
            max=A;
            min=B;
        }
        else {
            max= B;
            min=A;
        }
        int mod=max%min;
        if (mod==0) {
            return max;
        }
        else {
            for (int i=2; i<max*max; i++) {
                int mult=max*i;
                if (mult%min==0) {
                    return mult;
                }
            }
        }
        return 0;
    }
}
