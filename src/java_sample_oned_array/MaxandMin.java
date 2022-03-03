package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class MaxandMin {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //take N input

        int[] arr=new int[N]; //declare new array
        int max=Integer.MIN_VALUE; //initialize max
        int min=Integer.MAX_VALUE; //initialize min

        for (int i=0; i<N; i++) { //condition to find max and min from linr 14 to 22
            arr[i]=sc.nextInt();
            if (arr[i]>max) {
                max=arr[i];
            }
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.print(max+" "+min); //return value of max and min
    }

}
