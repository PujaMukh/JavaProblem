package subsequence_subset;

import java.util.Scanner;

//given an array, check if there exists a subset with sum==k
public class CheckIfSubsetSumK {
    static boolean checkIf(int A[], int B) {
        //n is the size of the array
        //B is the value which we have to check with sum
        if (B==0) {
            return true;
        }
        int pow=(int)Math.pow(2,A.length);
        for (int i=0; i<pow; i++) {
            int j=0;
            int sum=0;
            int num=i;

            while(num >0){
                if((num & 1) == 1 ){
                    sum =sum+ A[j];
                }
                j++;
                num = num>>1;
            }


            if (sum==B) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]A=new int[n];
        for (int i=0; i<n; i++) {
            A[i]=sc.nextInt();
        }
        int B=sc.nextInt();
        System.out.println(checkIf(A,B));

    }
}
//TC is 2^n*N