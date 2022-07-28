package extra_practise;

import java.util.Scanner;

//Given an array containing duplicate numbers and a target value,
// find the index of 2nd occurence of the target value
public class TargetOf2ndOcc {
    static int findOcc(int[] A, int B) {
        int count=0;
        for (int i=0; i<A.length; i++) {
            if(A[i]==B) {
                count++;
            }
            if (count==2) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for (int i=0; i<N; i++) {
            A[i]=sc.nextInt();
        }
        int B=sc.nextInt();
        System.out.println(findOcc(A,B));


    }
}
