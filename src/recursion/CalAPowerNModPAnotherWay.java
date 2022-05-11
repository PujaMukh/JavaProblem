package recursion;
import java.lang.*;
import java.util.*;
//calculate A^B%C and make sure ans is not negative. Make it positive if ans is negative
//also make sure it doesnt overflow
public class CalAPowerNModPAnotherWay {
    static int findPow(int A, int B, int C) {
        if (A==0) {
            return 0; //0^1 and up is always 0
        }
        long ans=pow(A, B, C);
        if (ans<0) {         //to make ans positive as asked in the ques
            return (int)(ans+C)%C;
        }
        return (int)ans;
    }
    static long pow(long A, long B, long C) {
          if (B==0) {
              return 1; //when to break
          }
          long p=pow(A,B/2, C); //main logic
          if (B%2==0) {
              return (int)(p*p)%C;
          }
          else {
              return (int)(A*((p*p)%C)%C);
          }
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        System.out.println(findPow(A, B,C));

    }
}
