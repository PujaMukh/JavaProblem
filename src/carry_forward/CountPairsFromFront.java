package carry_forward;

import java.util.Scanner;

//now do the same question of finding number of pairs where s[i]=a and s[j]=g and i<j
//start from the front now instead of counting from back
public class CountPairsFromFront {
    static int countPair(char[]S) {
        int N=S.length; //length of character array

        //so now we have to calculate the number of a's and store it in a variable
        //whenever we are getting a g, make it result+count of a's

        int countof_a=0; //initializing both count of a's and result variable to 0
        int result=0;

        for (int i=0; i<N; i++) {
            if (S[i]=='a') {
                countof_a++;
            }
            else if (S[i]=='g') {
                result=result+countof_a;
            }
        }
        return result;
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //length of character array

        char[] S=new char[N];
        for (int i=0; i<N; i++) {
            S[i]=sc.next().charAt(0);
        }
        System.out.print(countPair(S));
    }
}

//Time complexity is O(N) and space complexity is O(1)
