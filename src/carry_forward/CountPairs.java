package carry_forward;

import java.lang.*;
import java.util.*;


public class CountPairs {
        //given a character array, find the count of pairs where s[i]==a and s[j]==g, and i<j
//from right to left
        static int findCount(char[]S) {
            //we have to count number of g's on right side for every a on left
            //initializing number g's with c
            //intializing total number of pairs with ans

            int result=0;
            int countof_g=0;
            int N=S.length; //size of the given character array
            for (int i=N-1; i>=0; i--) {

                if (S[i]=='g') {
                    countof_g++;
                }
                else if (S[i] == 'a') {
                    result = result + countof_g;
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
            System.out.print(findCount(S));
        }

    }


//Time complexity is O(N) and space complexity is O(1)

