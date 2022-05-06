package ModularArithmatic;
import java.lang.*;
import java.util.*;
public class RepeatAndMissingUsingMaths {
    static int[] repeatedNumber(final int[] A) {
        long repeatNum = 0;
        long missingNum = 0;
        long currentSum = 0;
        long actualSum = ((long)A.length)*(A.length+1)/2;
        long currentSumSq = 0;
        long actualSumSq= 0;

        for(int j=0;j<A.length;j++){
            currentSum =currentSum+ (long)A[j]; //sum of all elements
        }

        for(int i =0;i<A.length;i++){
            currentSumSq = currentSumSq+((long)A[i]) *A[i]; //sum of all elements sq
        }

        for(long k =1;k<=A.length;k++){
            actualSumSq =actualSumSq+(k*k); //N(N+1)(2+1)/6
        }

        long val1 = (actualSumSq - currentSumSq)/(actualSum - currentSum);
        //val1=x^2-y^2/x-y=x+y
        long val2 = actualSum-currentSum; //val2=x-y

        //adding both above equations we get....
        missingNum = (val1 + val2)/2; //missing number is x
        //y=x(missingno)-val2
        repeatNum = missingNum - val2;

        return new int[] {(int)repeatNum, (int)missingNum};


    }


    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int[]output=repeatedNumber(A);
        for (int i=0; i<2; i++) {
            System.out.print(output[i]+" ");
        }


    }

}
//TC is O(N), SC is O(1)
