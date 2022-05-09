package hashing;
//return the subarray which adds up to given sum B.
//if not there, return an array with just -1
import java.lang.*;
import java.util.*;
public class SubarrayWithGivenSum {
    static int[] solve(int[] A, int B) {
        int N=A.length;
        HashMap<Integer, Integer>hm=new HashMap<Integer,Integer>();
        int sum=0;
        int startIndex=-1;
        int endIndex=-1;
        hm.put(0,-1);

        for (int i=0; i<N; i++) {
            sum=sum+A[i];
            int b=sum-B; //takeing sum 1st as sum might be higher than B

            //if sum-B is there, get index
            //else add sum in hm
            if (hm.containsKey(b)) {
                int val=hm.get(b);
                startIndex=val+1;
                endIndex=i;

                break;

            }
            else {
                hm.put(sum,i);
            }
        }
        ArrayList<Integer>output=new ArrayList<Integer>();
        if (startIndex!=-1) {
            for(int i=startIndex; i<=endIndex; i++) {
                output.add(A[i]);
            }
        }
        else {
            output.add(-1);
        }
        int M=output.size();
        int[]result=new int[M];
            for (int i=0; i<M; i++) {
                result[i]=output.get(i);
            }

        return result;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take input for size of array
        int[]A=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            A[i]=sc.nextInt();
        }
        int B= sc.nextInt();
        int[] res=solve(A,B);
        int M=res.length;
        for (int i=0; i<M; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
//TC is O(N), SC is O(N)