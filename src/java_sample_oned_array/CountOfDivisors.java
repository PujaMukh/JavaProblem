package java_sample_oned_array;
//given an array, return count of divisors of each ele in array in O(N) time
public class CountOfDivisors { public int[] solve(int[] A) {
    int max=Integer.MIN_VALUE;
    for (int i=0; i<A.length; i++) {
        if (A[i]>max) {
            max=A[i]; //eg suppose 5 is max
        }
    }
    int[] temp=new int[max+1]; //0 1 2 3 4 5
    for (int i=0; i<(max+1); i++) {  //make everything 1 as 1 is divisor for every number
        temp[i]=1;
    }
    //now for every no in given array, go to each multiple index upto max/2 and inc the count (whatever the count was)
    for (int i=2; i<=max; i++) { //for number 2, inc count in multiples of that number
        //eg for 2- inc count in 2, 4, 6 etc
        //for 3...inc count in 3,6,9 etc....
        //eg if 1st no is 2, go to 2, 4 etc (upto max) and inc count
        //count already is 1 in temp array
        int j=i; //j=2
        while (j<=max) {
            temp[j]++;
            j=j+i; //j=4
        }

    }

    int[] output=new int[A.length];
    for (int i=0; i<A.length; i++) {
        output[i]=temp[A[i]]; //2 2 3 2
    }

    return output;

}
}
//TC O(N), SC is O(N)