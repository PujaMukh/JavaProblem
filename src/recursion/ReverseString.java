package recursion;
//reverse and print a string using recursion
import java.lang.*;
import java.util.*;
public class ReverseString {
    static void printRev(String S, int ptr) {
        int N=S.length();

        if (ptr==0) { //ptr is index
            System.out.print(S.charAt(ptr));   //base condition(when to break)
            return;
        }

        System.out.print(S.charAt(ptr)); //main logic
        printRev(S, ptr-1);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int N=S.length();
        printRev(S,N-1);
    }
}
