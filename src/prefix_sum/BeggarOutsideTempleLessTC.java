package prefix_sum;

import java.util.Scanner;

//given an array with all ele 0
//given q queries with start and end index and value, perform prefix sum in less time complexity
public class BeggarOutsideTempleLessTC {
    static int[] beggarProblem(int[]A, int[][]B) { //N will be the final size of array
        //hint: go upto the last index and from end+1 index to end do - that value
        //use the same observation as solve queries with val
        //eg A=0 0 0 0 0, B= 0 1 10,1 2 20, 1 4 25, ans=10 55 45 25 25
        for (int i=0; i<B.length; i++) {
            int startIndex=B[i][0];
            int endIndex=B[i][1];
            int val=B[i][2];
            A[startIndex]=A[startIndex]+val;
            if (endIndex!=A.length-1) {
                A[endIndex+1]=A[endIndex+1]-val;

            }

        }
        //construct prefix sum array till end
        //now delete that val from end+1 index to end by doing prefixminus
        int[] pfSum=new int[A.length];
        pfSum[0]=A[0];
        for (int i=1; i<A.length; i++) {
            pfSum[i]=pfSum[i-1]+A[i];  //10 55 55 55 55
        }


    return pfSum;


    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        int[][]B=new int[r][3];
        for (int i=0; i<r; i++) {
            for (int j=0; j<3; j++) {
                B[i][j]=sc.nextInt();
            }
        }
        int[]output=beggarProblem(A,B);
        for (int i=0; i<N; i++) {
            System.out.print(output[i]+" ");
        }

    }
}
//TC is O(N), SC is O(N)