package extra_problems;

import java.util.HashSet;
import java.util.Scanner;

//given an array of string representing N large numbers and an int B, return count of pairs whose
//concatenation is divisible by B (consider all pairs except when i==j)
//eg except 00, 11, 22 etc
public class Concatenation {
    public static int concat(String[]A, int B) {
        HashSet<String>hs=new HashSet<>();
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A.length; j++) {
                if (i!=j) {
                    String S=A[i]+A[j];
                    if (S.charAt(0)!='0') {
                        hs.add(S);
                    }
                }
            }
        }
        int count=0;
        for (String str:hs) { //str is like i(loop by value)
            if (checkIfDivisible(str,B)==true) {
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
        StringBuilder sb=new StringBuilder();
        while(i<A.length()) {
            sb.append(A.charAt(i));
            num=Integer.parseInt(sb.toString());
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
        String[]S=new String[N];
        for (int i=0; i<S.length; i++) {
            S[i]=sc.next();
        }
        int B=sc.nextInt();
        System.out.println(concat(S,B));

    }
}
