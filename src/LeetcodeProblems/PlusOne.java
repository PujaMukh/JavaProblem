package LeetcodeProblems;
//leetcode number 66
//add pplus 1 to an array of integers, eg. [9,2,1]= [9,2,2]
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int N=digits.length; //size of array named digits
        ArrayList<Integer>output=new ArrayList<Integer>();

        int sum=0;
        int dig=0;
        int carry=0;

        int i=N-1;

        sum=digits[i]+1;
        dig=sum%10;
        carry=sum/10;
        output.add(dig);

        if (N>1) {
            for (i=N-2; i>=0; i--) {
                sum=digits[i]+carry;
                dig=sum%10;
                carry=sum/10;
                output.add(dig);
            }
        }

        if (carry>0) {
            output.add(carry);
        }

        //now reverse the array

        int M=output.size();

        int[] A=new int[M];
        for (i=0; i<M; i++) {
            A[i]=output.get(i);

        }

        //reverse
        int j=0;
        while (j<M/2) {
            int temp=A[M-1-j];
            A[M-1-j]=A[j];
            A[j]=temp;

            j++;
        }
        return A;

    }
}
//TC is O(N), SC is O(N)
