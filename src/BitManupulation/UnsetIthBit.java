package BitManupulation;
//given N, unset ith bit in N
//means if 1, change to 0. If 0 let it be
//bit manipulation 3 video
import java.lang.*;
import java.util.*;
public class UnsetIthBit {
    static int unset(int A, int i) {
        //we have to do & with 0 in ith bit and everything else will be & with 1 to keep everything else same
        return A& ~(1<<i);

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int i= sc.nextInt();
        System.out.print(unset(A,i));
    }

}
//TC is O(1), SC is O(1)
