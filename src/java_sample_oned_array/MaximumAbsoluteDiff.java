package java_sample_oned_array;
//return the max value of i,j where f(i,j)= |A[i-A[j|+|i-j|
public class MaximumAbsoluteDiff {
    //brute force is checking every subarray and updating maxsum, but time complexity is N^2
    //so,
    public int maxArr(int[] A) {
        //case 1: if Ai>Aj && i>j, then Ai-Aj+i-j=(Ai+i)-(Aj+j)-1
        //case 2: if Ai>Aj && i<j, then Ai+Aj-i+j=(Ai-i)+(Aj+j)-2
        //case 3: if Ai<Aj && i>j, then -Ai+Aj+i-j=-(Ai-i)+(Aj-j)-3
        //case 4: if Ai<Aj && i<j, then -Ai+Aj-i+j=-(Ai+i)+(Aj+j)-4
        //eq 1 & 4 are same and 2 & 3 are same
        //find max and min of Ai+i
        //find max and min of Ai-i
        //return max of max1-min1 and max2-min2

        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;


        for (int i=0; i<A.length; i++) {
            max1=Math.max(max1, A[i]+i);
            min1=Math.min(min1, A[i]+i);
            max2=Math.max(max2, A[i]-i);
            min2=Math.min(min2, A[i]-i);

        }
        return Math.max(max1-min1, max2-min2);
    }
}
//TC is O(N), SC is O(1)