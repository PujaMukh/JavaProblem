package java_very_simpleproblems;
//print all even 
import java.lang.*;
import java.util.*;
public class PrintEven {
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int i=2;
        while(i<=A) {
            System.out.println(i);
            i=i+2;
        }
    }
}
