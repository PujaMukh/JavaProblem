package subarray;

import java.util.ArrayList;
import java.util.Scanner;

//return count of good subarrays
//subarray good if:
//1) if length of subarray is odd and if sum>B
//2) if length of subarray is even and if sum<B
public class GoodSubarray {
    static int findGoodSubarrays(ArrayList<Integer> A, int B) {
        int sum=0;
        int length=0;
        int count=0;
        for (int i=0; i<A.size(); i++) {
            sum=0;
            length=0;
            for (int j=i; j<A.size(); j++) {
                sum=sum+A.get(j);
                length=length+1;
                if (length%2==0) {
                    if (sum<B) {
                        count++;
                    }
                }
                if (length%2!=0) {
                    if (sum>B) {
                        count++;
                    }
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
        System.out.println(findGoodSubarrays(A,B));

    }
}
