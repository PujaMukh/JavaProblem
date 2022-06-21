package sorting;

import java.util.ArrayList;
import java.util.Collections;

//find if a noble integer exists.
//noble int is an int in the array such that number of integers greater than this int is equal to this int
public class NobleIntegerDistinct1 {
    //1st sort and start looping from last and keep a count
    //if ele==A[i], inc count
    //if not equal, check if count==A[i], then we have our noble integer
    //if not equal, another else would be, to update ele and inc count

    public int solve(ArrayList<Integer> A) {
        Collections.sort(A); //nlog n
        int N=A.size();
        int ele=A.get(N-1);

        if (ele==0) { //edge case if last ele after sorting is 0
            return 1;
        }
        int count=1;
        for (int i=N-2; i>=0; i--) {
            if (ele==A.get(i)) {
                count++;
            }
            else if (ele!=A.get(i)) {
                if (count==A.get(i)) {
                    return 1;

                }
                else {
                    count++;
                    ele=A.get(i);
                }
            }



        }
        return -1;

    }
}
//TC is n log n because of sorting, SC is O(1)