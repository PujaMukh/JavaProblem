package subarray;

import java.util.ArrayList;
import java.util.Scanner;

//find the 1st index of the subarray with least average and size B using window sliding technique
public class SubArrayLeastAverage {
    static int findIndex(ArrayList<Integer> A, int B) {
        //USE WINDOW SLIDING
        int N=A.size();
        long sum=0;
        int ans=0;
        long minSum=Integer.MAX_VALUE;
        for (int i=0; i<B; i++) {    //find the sum of 1st B elements
            sum=sum+(long)A.get(i);
        }
        minSum=sum;

        for (int i=1; i<=N-B; i++) {
            sum=sum-(long)A.get(i-1)+(long)A.get(B+i-1);

            if (sum<minSum) {
                minSum=sum;
                ans=i;
            }
        }
        return ans;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer>A=new ArrayList<>();
        for (int i=0; i<N; i++) {
            A.add(sc.nextInt());
        }
        int B=sc.nextInt();
        System.out.println(findIndex(A,B));

    }
}
