package java_string;

import java.util.ArrayList;
import java.util.Scanner;

//in a character array, if all chars are either from a-z or from A-Z or from 0-9, return 1
//else return 0
public class AlphaNumeric {
    static int solve(ArrayList<Character> A) {
        for(int i=0; i<A.size(); i++) {
            if (A.get(i)>='a' && A.get(i)<='z') {

            }
            else if (A.get(i)>='A' && A.get(i)<='Z') {

            }
            else if (A.get(i)>='0' && A.get(i)<='9') {

            }
            else {
                return 0;
            }

        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Character>A=new ArrayList<>();
        for (int i=0; i<N; i++) {
            A.add(sc.next().charAt(0));

        }
        System.out.println(solve(A));

    }
}
//TC is O(N), SC is O(1)