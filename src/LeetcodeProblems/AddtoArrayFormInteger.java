package LeetcodeProblems;
//leetcode 989
//add an integer to another integer which is in the form of an array and return an array

import java.lang.*;
import java.util.*;
public class AddtoArrayFormInteger {
    static List<Integer> addToArrayForm(int[] num, int k) {
        int N=num.length;

        int sum=0;
        int carry=0;
        int digit=0;
        ArrayList<Integer>tempStorage=new ArrayList<Integer>();


        int i=N-1;
        while (i>=0 && k>0) {
            sum=num[i]+k%10+carry;
            carry=sum/10;
            digit=sum%10;
            tempStorage.add(digit);
            k=k/10;
            i--;

        }

        if(k!=0 && i==-1) {
            while (k>0) {
                sum=k%10+carry;
                carry=sum/10;
                digit=sum%10;
                tempStorage.add(digit);
                k=k/10;
            }
        }

        else if (k==0 && i>-1) {
            while (i>=0) {
                sum=num[i]+carry;
                carry=sum/10;
                digit=sum%10;
                tempStorage.add(digit);
                i--;
            }
        }
        if (carry>0) {
            tempStorage.add(carry);
        }

        int M=tempStorage.size();
        int j=0;
        while (j<M/2) {
            int temp=tempStorage.get(M-1-j);
            tempStorage.set(M-1-j, tempStorage.get(j));
            tempStorage.set(j, temp);
            j++;
        }
        return tempStorage;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]num=new int[N]; //declare input array
        for (int i=0; i<N; i++) { //take input for array elements
            num[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(addToArrayForm(num,k));
    }
}
//TC is O(N), SC is O(1)
