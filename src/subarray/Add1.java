package subarray;

import java.util.ArrayList;
import java.util.Scanner;

//given an array of integers, add 1 to it.
//if it has leading 0's eg 0123, ans will be 124 (leading 0 will be deleted)
public class Add1 {
    static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int N=A.size();
        ArrayList<Integer>output=new ArrayList<>();
        int digit=A.get(N-1)+1;
        int carry=digit/10;
        output.add(digit%10);
        ArrayList<Integer>input=new ArrayList<>();
        int j=0;
        while (j<A.size()-1 && A.get(j)==0) {
            j++;
        }
        for (int i=A.size()-2; i>=j; i--) {
            digit=A.get(i)+carry;
            carry=digit/10;
            output.add(digit%10);
        }
        if (carry>0) {
            output.add(carry);
        }
        //reverse in place to save space
        int ptr1=0;
        int ptr2=output.size()-1;
        while (ptr1<ptr2) {
            int temp=output.get(ptr2);
            output.set(ptr2, output.get(ptr1));
            output.set(ptr1, temp);
            ptr1++;
            ptr2--;
        }
        return output;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer>A=new ArrayList<>();
        for (int i=0; i<N; i++) {
            A.add(sc.nextInt());
        }
      ArrayList<Integer>output= plusOne(A);
       for (int i=0; i<output.size(); i++) {
           System.out.print(output.get(i)+" ");
       }

    }
}
