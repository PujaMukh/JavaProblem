package extra_problems;

import java.util.Scanner;

//given a string, insert the number associated with that character and return the final string
//eg. abcd, ans=a1b2c3d4
public class InsertNumberAfterCharacter {
    static String insert(String A) {
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<A.length(); i++) {
            sb.append(A.charAt(i));
            sb.append(A.charAt(i)-'a'+1);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(insert(A));

    }
}
//TC is O(N), SC is O(N)