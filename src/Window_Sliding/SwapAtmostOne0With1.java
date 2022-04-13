package Window_Sliding;
//given a binary array, you can atmost swap 1 0 with a 1 n the array. Find the max consequetive 1's
import java.lang.*;
import java.util.*;
public class SwapAtmostOne0With1 {
    //logic: same as the code where we are replacing 0 with 1 except 1 difference
    //in that code we always had an extra one to spare
    //here we might not have extra 1 to spare. So at the end if count=l+r (no extra 1 in arary to give),
    //the return ans
    //else ans=max(ans, l+r+1)
    //take different examples to understand (also in my copy)

    static int swapAtmostOne(int[]A) {
        int N=A.length;
        int ans=0;
        //edge case if all numbers are 1
        int count=0;
        for (int i=0; i<N; i++) {
            if (A[i]==1) {
                count++;
            }
        }
        if (count==N) {
            return count;
        } //edge case handled


        //now iterate again and once it hits a 0 we will bfreak into 2 loops
        for (int i=0; i<N; i++) {

            if (A[i]==0) {

                //1st loop left traverse
                int left=0;
                for(int j=i-1; j>=0; j--) {
                    if (A[j]==1) {
                        left++;
                    }
                    else if(A[i]==0) {
                        break;
                    }
                }

                //now traverse to right and count 1's
                int right=0;
                for (int j=i+1; j<N; j++) {
                    if (A[j]==1) {
                        right++;
                    }
                    else {
                        break;
                    }
                }
                if (left+right==count) { //that means no extra 1 to spare in array
                    ans=Math.max(ans, left+right);

                }
                else {
                    ans=Math.max(ans, left+right+1);
                }
            }
        }
        return ans;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        System.out.println(swapAtmostOne(A));
    }

}
//TC is O(N), SC is O(1)
