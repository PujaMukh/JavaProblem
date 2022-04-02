package prefix_sum;
//now do the min time problem using prefix sum

import java.lang.*;
import java.util.*;
public class MinTime1 {
    static int minTime(ArrayList<Integer>A) {
        int N=A.size();
        //1st find max
        int max=0;
        int sum=0;
        for (int i=0; i<N; i++) {
            sum=sum+A.get(i);
            if(A.get(i)>max) {
                max=A.get(i);
            }
        }
        return (max*N)-sum;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer>A=new ArrayList<Integer>();
        for (int i=0; i<N; i++) {
            A.add(sc.nextInt());
        }
        System.out.print(minTime(A));
    }
}
//TC is O(N), SC is O(1)