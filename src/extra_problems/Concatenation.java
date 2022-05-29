package extra_problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//given an array of string representing N large numbers and an int B, return count of pairs whose
//concatenation is divisible by B (consider all pairs except when i==j)
//eg except 00, 11, 22 etc
public class Concatenation {
    public static int concat(ArrayList<String>A, int B) {
        ArrayList<String>res=new ArrayList<>();
        for (int i=0; i<A.size(); i++) {
            for (int j=0; j<A.size(); j++) {
                if (i!=j) {
                    res.add(A.get(i)+A.get(j));
                }
            }
        }
        int count=0;
        for (int i=0; i<res.size(); i++) {
            if (checkIfDivisible(res.get(i),B)==true) {
                count++;

            }
        }

        return count;

    }
    public static boolean checkIfDivisible(String A, int B) {
        //check if string A is divisible by B
        int i=0;
        int num=0;
        int mod=0;

        while(i<A.length()) {
            String S=Integer.toString(mod)+A.charAt(i);

            num=Integer.parseInt(S);
            mod=num%B;
            i++;
        }
        if (mod!=0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
       ArrayList<String>S=new ArrayList<>();
        for (int i=0; i<N; i++) {
            S.add(sc.next());
    //        System.out.println(S.get(i));
        }
        int B=sc.nextInt();
        System.out.println(concat(S,B));

    }
}
