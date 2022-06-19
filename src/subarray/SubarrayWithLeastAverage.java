package subarray;

import java.util.ArrayList;
import java.util.Scanner;

//find the subarray(return the 1st index of the subarray) of size B and with least average
public class SubarrayWithLeastAverage {
    static int solve(ArrayList<Integer> A, int B) {
        //find min sum subarray with size B(return the 1st index)
        int minSum=Integer.MAX_VALUE;
        int ptr1=0;
        int ptr2=0;
        int sum=0;
        int N=A.size();
        int ans=0;
        int count=0;

        while (ptr1<=N-B) {
            sum=0;

            while (ptr2<N && count<B) {
                sum=sum+A.get(ptr2);
                ptr2++;
                count=count+1;
            }

            if (sum<minSum) {
                minSum=sum;
                ans=ptr1;
            }
            ptr1++;
            ptr2=ptr1;
            count=0;
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
        System.out.println(solve(A,B));

    }
}
