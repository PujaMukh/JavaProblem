package subarray;

import java.util.ArrayList;
import java.util.Scanner;

//count the number of subarrays with sum<B
public class CountSubarraysWithSumLessThanB {
    static int countSubarrays(ArrayList<Integer> A, int B) {
        int sum=0;
        int count=0;
        for (int i=0; i<A.size(); i++) {
            sum=0;
            for (int j=i; j<A.size(); j++) {
                sum=sum+A.get(j);

                if (sum<B) {
                    count++;
                }
                if (sum>B) {
                    break;
                }
            }
        }
        return count;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer>A=new ArrayList<>();
        for (int i=0; i<N; i++) {
            A.add(sc.nextInt());
        }
        int B=sc.nextInt();
        System.out.println(countSubarrays(A,B));

    }
}
